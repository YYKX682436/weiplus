package io.flutter;

/* loaded from: classes13.dex */
public final class FlutterInjector {
    private static boolean accessed;
    private static io.flutter.FlutterInjector instance;
    private io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager deferredComponentManager;
    private java.util.concurrent.ExecutorService executorService;
    private io.flutter.embedding.engine.FlutterJNI.Factory flutterJniFactory;
    private io.flutter.embedding.engine.loader.FlutterLoader flutterLoader;

    /* loaded from: classes13.dex */
    public static final class Builder {
        private io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager deferredComponentManager;
        private java.util.concurrent.ExecutorService executorService;
        private io.flutter.embedding.engine.FlutterJNI.Factory flutterJniFactory;
        private io.flutter.embedding.engine.loader.FlutterLoader flutterLoader;

        /* loaded from: classes13.dex */
        public class NamedThreadFactory implements java.util.concurrent.ThreadFactory {
            private int threadId;

            private NamedThreadFactory() {
                this.threadId = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.Thread thread = new java.lang.Thread(runnable);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("flutter-worker-");
                int i17 = this.threadId;
                this.threadId = i17 + 1;
                sb6.append(i17);
                thread.setName(sb6.toString());
                return thread;
            }
        }

        private void fillDefaults() {
            if (this.flutterJniFactory == null) {
                this.flutterJniFactory = new io.flutter.embedding.engine.FlutterJNI.Factory();
            }
            if (this.executorService == null) {
                this.executorService = java.util.concurrent.Executors.newCachedThreadPool(new io.flutter.FlutterInjector.Builder.NamedThreadFactory());
            }
            if (this.flutterLoader == null) {
                this.flutterLoader = new io.flutter.embedding.engine.loader.FlutterLoader(this.flutterJniFactory.provideFlutterJNI(), this.executorService);
            }
        }

        public io.flutter.FlutterInjector build() {
            fillDefaults();
            return new io.flutter.FlutterInjector(this.flutterLoader, this.deferredComponentManager, this.flutterJniFactory, this.executorService);
        }

        public io.flutter.FlutterInjector.Builder setDeferredComponentManager(io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager deferredComponentManager) {
            this.deferredComponentManager = deferredComponentManager;
            return this;
        }

        public io.flutter.FlutterInjector.Builder setExecutorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        public io.flutter.FlutterInjector.Builder setFlutterJNIFactory(io.flutter.embedding.engine.FlutterJNI.Factory factory) {
            this.flutterJniFactory = factory;
            return this;
        }

        public io.flutter.FlutterInjector.Builder setFlutterLoader(io.flutter.embedding.engine.loader.FlutterLoader flutterLoader) {
            this.flutterLoader = flutterLoader;
            return this;
        }
    }

    public static io.flutter.FlutterInjector instance() {
        accessed = true;
        if (instance == null) {
            instance = new io.flutter.FlutterInjector.Builder().build();
        }
        return instance;
    }

    public static void reset() {
        accessed = false;
        instance = null;
    }

    public static void setInstance(io.flutter.FlutterInjector flutterInjector) {
        if (accessed) {
            throw new java.lang.IllegalStateException("Cannot change the FlutterInjector instance once it's been read. If you're trying to dependency inject, be sure to do so at the beginning of the program");
        }
        instance = flutterInjector;
    }

    public io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager deferredComponentManager() {
        return this.deferredComponentManager;
    }

    public java.util.concurrent.ExecutorService executorService() {
        return this.executorService;
    }

    public io.flutter.embedding.engine.loader.FlutterLoader flutterLoader() {
        return this.flutterLoader;
    }

    public io.flutter.embedding.engine.FlutterJNI.Factory getFlutterJNIFactory() {
        return this.flutterJniFactory;
    }

    private FlutterInjector(io.flutter.embedding.engine.loader.FlutterLoader flutterLoader, io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager deferredComponentManager, io.flutter.embedding.engine.FlutterJNI.Factory factory, java.util.concurrent.ExecutorService executorService) {
        this.flutterLoader = flutterLoader;
        this.deferredComponentManager = deferredComponentManager;
        this.flutterJniFactory = factory;
        this.executorService = executorService;
    }
}
