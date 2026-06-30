package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class i4 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123782a;

    static {
        int[] iArr = new int[com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.values().length];
        try {
            iArr[com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.LOADING.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.LOADED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.FAILURE.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.PRIVATE_LOCK.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.BLOCKED.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        f123782a = iArr;
    }
}
