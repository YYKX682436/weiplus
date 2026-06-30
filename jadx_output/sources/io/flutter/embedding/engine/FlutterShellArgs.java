package io.flutter.embedding.engine;

/* loaded from: classes11.dex */
public class FlutterShellArgs {
    public static final java.lang.String ARG_BIND_CPU_CORES = "--bind-cpu-cores";
    public static final java.lang.String ARG_CACHE_SKSL = "--cache-sksl";
    public static final java.lang.String ARG_DART_FLAGS = "--dart-flags";
    public static final java.lang.String ARG_DISABLE_IMPELLER = "--enable-impeller=false";
    public static final java.lang.String ARG_DISABLE_SERVICE_AUTH_CODES = "--disable-service-auth-codes";
    public static final java.lang.String ARG_DUMP_SHADER_SKP_ON_SHADER_COMPILATION = "--dump-skp-on-shader-compilation";
    public static final java.lang.String ARG_ENABLE_DART_PROFILING = "--enable-dart-profiling";
    public static final java.lang.String ARG_ENABLE_IMPELLER = "--enable-impeller=true";
    public static final java.lang.String ARG_ENABLE_MM_PROFILER = "--enable-mmprofiler";
    public static final java.lang.String ARG_ENABLE_RASTER_PROFILING = "--enable-raster-profiling";
    public static final java.lang.String ARG_ENABLE_SOFTWARE_RENDERING = "--enable-software-rendering";
    public static final java.lang.String ARG_ENABLE_VULKAN_VALIDATION = "--enable-vulkan-validation";
    public static final java.lang.String ARG_ENDLESS_TRACE_BUFFER = "--endless-trace-buffer";
    public static final java.lang.String ARG_KEY_CACHE_SKSL = "cache-sksl";
    public static final java.lang.String ARG_KEY_DART_FLAGS = "dart-flags";
    public static final java.lang.String ARG_KEY_DISABLE_SERVICE_AUTH_CODES = "disable-service-auth-codes";
    public static final java.lang.String ARG_KEY_DUMP_SHADER_SKP_ON_SHADER_COMPILATION = "dump-skp-on-shader-compilation";
    public static final java.lang.String ARG_KEY_ENABLE_DART_PROFILING = "enable-dart-profiling";
    public static final java.lang.String ARG_KEY_ENABLE_SOFTWARE_RENDERING = "enable-software-rendering";
    public static final java.lang.String ARG_KEY_ENABLE_VULKAN_VALIDATION = "enable-vulkan-validation";
    public static final java.lang.String ARG_KEY_ENDLESS_TRACE_BUFFER = "endless-trace-buffer";
    public static final java.lang.String ARG_KEY_MMTRACE_TO_FILE = "mmtrace-to-file";
    public static final java.lang.String ARG_KEY_MSAA_SAMPLES = "msaa-samples";
    public static final java.lang.String ARG_KEY_PROFILE_MICROTASKS = "profile-microtasks";
    public static final java.lang.String ARG_KEY_PURGE_PERSISTENT_CACHE = "purge-persistent-cache";
    public static final java.lang.String ARG_KEY_SKIA_DETERMINISTIC_RENDERING = "skia-deterministic-rendering";
    public static final java.lang.String ARG_KEY_START_PAUSED = "start-paused";
    public static final java.lang.String ARG_KEY_TOGGLE_IMPELLER = "enable-impeller";
    public static final java.lang.String ARG_KEY_TRACE_SKIA = "trace-skia";
    public static final java.lang.String ARG_KEY_TRACE_SKIA_ALLOWLIST = "trace-skia-allowlist";
    public static final java.lang.String ARG_KEY_TRACE_STARTUP = "trace-startup";
    public static final java.lang.String ARG_KEY_TRACE_SYSTRACE = "trace-systrace";
    public static final java.lang.String ARG_KEY_TRACE_TO_FILE = "trace-to-file";
    public static final java.lang.String ARG_KEY_USE_TEST_FONTS = "use-test-fonts";
    public static final java.lang.String ARG_KEY_VERBOSE_LOGGING = "verbose-logging";
    public static final java.lang.String ARG_KEY_VM_SERVICE_PORT = "vm-service-port";
    public static final java.lang.String ARG_MMTRACE_TO_FILE = "--mmtrace-to-file";
    public static final java.lang.String ARG_MSAA_SAMPLES = "--msaa-samples";
    public static final java.lang.String ARG_PROFILE_MICROTASKS = "--profile-microtasks";
    public static final java.lang.String ARG_PURGE_PERSISTENT_CACHE = "--purge-persistent-cache";
    public static final java.lang.String ARG_SKIA_DETERMINISTIC_RENDERING = "--skia-deterministic-rendering";
    public static final java.lang.String ARG_START_PAUSED = "--start-paused";
    public static final java.lang.String ARG_TRACE_SKIA = "--trace-skia";
    public static final java.lang.String ARG_TRACE_SKIA_ALLOWLIST = "--trace-skia-allowlist=";
    public static final java.lang.String ARG_TRACE_STARTUP = "--trace-startup";
    public static final java.lang.String ARG_TRACE_SYSTRACE = "--trace-systrace";
    public static final java.lang.String ARG_TRACE_TO_FILE = "--trace-to-file";
    public static final java.lang.String ARG_USE_TEST_FONTS = "--use-test-fonts";
    public static final java.lang.String ARG_VERBOSE_LOGGING = "--verbose-logging";
    public static final java.lang.String ARG_VM_SERVICE_PORT = "--vm-service-port=";
    private java.util.Set<java.lang.String> args;

    public FlutterShellArgs(java.lang.String[] strArr) {
        this.args = new java.util.HashSet(java.util.Arrays.asList(strArr));
    }

    public static io.flutter.embedding.engine.FlutterShellArgs fromIntent(android.content.Intent intent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (intent.getBooleanExtra(ARG_KEY_TRACE_STARTUP, false)) {
            arrayList.add(ARG_TRACE_STARTUP);
        }
        if (intent.getBooleanExtra(ARG_KEY_START_PAUSED, false)) {
            arrayList.add(ARG_START_PAUSED);
        }
        int intExtra = intent.getIntExtra(ARG_KEY_VM_SERVICE_PORT, 0);
        if (intExtra > 0) {
            arrayList.add(ARG_VM_SERVICE_PORT + java.lang.Integer.toString(intExtra));
        }
        if (intent.getBooleanExtra(ARG_KEY_DISABLE_SERVICE_AUTH_CODES, false)) {
            arrayList.add(ARG_DISABLE_SERVICE_AUTH_CODES);
        }
        if (intent.getBooleanExtra(ARG_KEY_ENDLESS_TRACE_BUFFER, false)) {
            arrayList.add(ARG_ENDLESS_TRACE_BUFFER);
        }
        if (intent.getBooleanExtra(ARG_KEY_USE_TEST_FONTS, false)) {
            arrayList.add(ARG_USE_TEST_FONTS);
        }
        if (intent.getBooleanExtra(ARG_KEY_ENABLE_DART_PROFILING, false)) {
            arrayList.add(ARG_ENABLE_DART_PROFILING);
        }
        if (intent.getBooleanExtra(ARG_KEY_ENABLE_SOFTWARE_RENDERING, false)) {
            arrayList.add(ARG_ENABLE_SOFTWARE_RENDERING);
        }
        if (intent.getBooleanExtra(ARG_KEY_SKIA_DETERMINISTIC_RENDERING, false)) {
            arrayList.add(ARG_SKIA_DETERMINISTIC_RENDERING);
        }
        if (intent.getBooleanExtra(ARG_KEY_TRACE_SKIA, false)) {
            arrayList.add(ARG_TRACE_SKIA);
        }
        java.lang.String stringExtra = intent.getStringExtra(ARG_KEY_TRACE_SKIA_ALLOWLIST);
        if (stringExtra != null) {
            arrayList.add(ARG_TRACE_SKIA_ALLOWLIST.concat(stringExtra));
        }
        if (intent.getBooleanExtra(ARG_KEY_TRACE_SYSTRACE, false)) {
            arrayList.add(ARG_TRACE_SYSTRACE);
        }
        if (intent.hasExtra("trace-to-file")) {
            arrayList.add("--trace-to-file=" + intent.getStringExtra("trace-to-file"));
        }
        if (intent.hasExtra(ARG_KEY_PROFILE_MICROTASKS)) {
            arrayList.add(ARG_PROFILE_MICROTASKS);
        }
        if (intent.getBooleanExtra(ARG_KEY_MMTRACE_TO_FILE, false)) {
            arrayList.add(ARG_MMTRACE_TO_FILE);
        }
        if (intent.hasExtra(ARG_KEY_TOGGLE_IMPELLER)) {
            if (intent.getBooleanExtra(ARG_KEY_TOGGLE_IMPELLER, false)) {
                arrayList.add(ARG_ENABLE_IMPELLER);
            } else {
                arrayList.add(ARG_DISABLE_IMPELLER);
            }
        }
        if (intent.getBooleanExtra(ARG_KEY_ENABLE_VULKAN_VALIDATION, false)) {
            arrayList.add(ARG_ENABLE_VULKAN_VALIDATION);
        }
        if (intent.getBooleanExtra(ARG_KEY_DUMP_SHADER_SKP_ON_SHADER_COMPILATION, false)) {
            arrayList.add(ARG_DUMP_SHADER_SKP_ON_SHADER_COMPILATION);
        }
        if (intent.getBooleanExtra(ARG_KEY_CACHE_SKSL, false)) {
            arrayList.add(ARG_CACHE_SKSL);
        }
        if (intent.getBooleanExtra(ARG_KEY_PURGE_PERSISTENT_CACHE, false)) {
            arrayList.add(ARG_PURGE_PERSISTENT_CACHE);
        }
        if (intent.getBooleanExtra(ARG_KEY_VERBOSE_LOGGING, false)) {
            arrayList.add(ARG_VERBOSE_LOGGING);
        }
        int intExtra2 = intent.getIntExtra(ARG_KEY_MSAA_SAMPLES, 0);
        if (intExtra2 > 1) {
            arrayList.add("--msaa-samples=" + java.lang.Integer.toString(intExtra2));
        }
        if (intent.hasExtra(ARG_KEY_DART_FLAGS)) {
            arrayList.add("--dart-flags=" + intent.getStringExtra(ARG_KEY_DART_FLAGS));
        }
        return new io.flutter.embedding.engine.FlutterShellArgs(arrayList);
    }

    public void add(java.lang.String str) {
        this.args.add(str);
    }

    public void remove(java.lang.String str) {
        this.args.remove(str);
    }

    public java.lang.String[] toArray() {
        return (java.lang.String[]) this.args.toArray(new java.lang.String[this.args.size()]);
    }

    public FlutterShellArgs(java.util.List<java.lang.String> list) {
        this.args = new java.util.HashSet(list);
    }

    public FlutterShellArgs(java.util.Set<java.lang.String> set) {
        this.args = new java.util.HashSet(set);
    }
}
