package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public class p0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f183052d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f183053e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f183054f;

    /* renamed from: g, reason: collision with root package name */
    public final int f183055g;

    public p0() {
        this(null, null, null, 7, null);
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "fileId"), com.tencent.mm.protobuf.i.u(-1, "url"), com.tencent.mm.protobuf.i.u(-1, "decryptKey")});
        this.f183055g = appendAttrs;
        super.set__serialName("cdnInfoEntry");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{this.f183052d, this.f183053e, this.f183054f});
    }

    public /* synthetic */ p0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3);
        super.replaceDefault(this.f183055g, new java.lang.Object[]{this.f183052d, this.f183053e, this.f183054f});
    }

    public p0(java.lang.String fileId, java.lang.String url, java.lang.String decryptKey) {
        kotlin.jvm.internal.o.g(fileId, "fileId");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(decryptKey, "decryptKey");
        this.f183052d = fileId;
        this.f183053e = url;
        this.f183054f = decryptKey;
        super.replaceDefault(this.f183055g, new java.lang.Object[]{fileId, url, decryptKey});
    }
}
