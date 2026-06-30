package com.tencent.tav.core;

/* loaded from: classes10.dex */
public class AssetExtension {
    public static final java.lang.String SCENE_EXPORT = "export";
    public static final java.lang.String SCENE_PLAY = "play";
    public static final java.lang.String SCENE_THUMBNAIL = "thumbnail";
    private volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> extensionMap = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.lang.String scene;

    public AssetExtension(java.lang.String str) {
        this.scene = str;
    }

    public void addExtension(java.lang.String str, java.lang.Object obj) {
        this.extensionMap.put(str, obj);
    }

    public boolean containsKey(java.lang.String str) {
        return this.extensionMap.containsKey(str);
    }

    public boolean containsValue(java.lang.String str) {
        return this.extensionMap.containsValue(str);
    }

    public java.lang.String getScene() {
        return this.scene;
    }

    public java.lang.Object remove(java.lang.String str) {
        return this.extensionMap.remove(str);
    }
}
