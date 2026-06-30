package com.tencent.tav.extractor.wrapper;

/* loaded from: classes16.dex */
public class ExtractorWrapperPool {
    private static final java.util.HashMap<java.lang.String, com.tencent.tav.extractor.wrapper.ExtractorWrapper> extractorHashMap = new java.util.HashMap<>();

    public static synchronized void clear() {
        synchronized (com.tencent.tav.extractor.wrapper.ExtractorWrapperPool.class) {
            extractorHashMap.clear();
        }
    }

    public static synchronized boolean contains(java.lang.String str) {
        boolean containsKey;
        synchronized (com.tencent.tav.extractor.wrapper.ExtractorWrapperPool.class) {
            containsKey = extractorHashMap.containsKey(str);
        }
        return containsKey;
    }

    public static synchronized void fillIn(java.lang.String str, com.tencent.tav.extractor.AssetExtractor assetExtractor) {
        synchronized (com.tencent.tav.extractor.wrapper.ExtractorWrapperPool.class) {
            com.tencent.tav.extractor.wrapper.ExtractorWrapper extractorWrapper = get(str);
            extractorWrapper.checkAndLoad(assetExtractor);
            assetExtractor.setSize(extractorWrapper.getVideoSize());
            assetExtractor.setDuration(extractorWrapper.getDuration());
            assetExtractor.setPreferRotation(extractorWrapper.getPreferRotation());
        }
    }

    public static synchronized com.tencent.tav.extractor.wrapper.ExtractorWrapper get(java.lang.String str) {
        com.tencent.tav.extractor.wrapper.ExtractorWrapper extractorWrapper;
        synchronized (com.tencent.tav.extractor.wrapper.ExtractorWrapperPool.class) {
            java.util.HashMap<java.lang.String, com.tencent.tav.extractor.wrapper.ExtractorWrapper> hashMap = extractorHashMap;
            extractorWrapper = hashMap.get(str);
            if (extractorWrapper == null) {
                extractorWrapper = new com.tencent.tav.extractor.wrapper.ExtractorWrapper(str);
            }
            hashMap.put(str, extractorWrapper);
        }
        return extractorWrapper;
    }

    public static synchronized void load(java.lang.String str) {
        synchronized (com.tencent.tav.extractor.wrapper.ExtractorWrapperPool.class) {
            com.tencent.tav.extractor.AssetExtractor assetExtractor = new com.tencent.tav.extractor.AssetExtractor();
            assetExtractor.setDataSource(str);
            get(str).checkAndLoad(assetExtractor);
        }
    }

    public static synchronized void put(com.tencent.tav.extractor.wrapper.ExtractorWrapper extractorWrapper) {
        synchronized (com.tencent.tav.extractor.wrapper.ExtractorWrapperPool.class) {
            extractorHashMap.put(extractorWrapper.getVideoPath(), extractorWrapper);
        }
    }

    public static synchronized void load(com.tencent.tav.extractor.AssetExtractor assetExtractor) {
        synchronized (com.tencent.tav.extractor.wrapper.ExtractorWrapperPool.class) {
            get(assetExtractor.getSourcePath()).checkAndLoad(assetExtractor);
        }
    }
}
