package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.x f128276d = new com.tencent.mm.plugin.finder.storage.x();

    public x() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "广告H5参数拼接保证在hashtag之前", "AdUrlParamAppendBeforeHashtag", null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_ad_url_param_append_before_hashtag, false, 2, null);
        return aVar;
    }
}
