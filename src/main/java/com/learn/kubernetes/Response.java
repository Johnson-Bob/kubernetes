package com.learn.kubernetes;

import java.util.List;
import java.util.Map;

public record Response(String name, Map<String, String> data, List<String> books) {
}
