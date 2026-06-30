package com.tencent.mm.plugin.webview.model;

/* loaded from: classes5.dex */
public class r0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f183081d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f183082e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f183083f;

    /* renamed from: g, reason: collision with root package name */
    public final int f183084g;

    public r0() {
        this(null, null, null, 7, null);
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "plainText"), com.tencent.mm.protobuf.i.u(-1, "fileId"), com.tencent.mm.protobuf.i.u(-1, "fetchType")});
        this.f183084g = appendAttrs;
        super.set__serialName("chatRecord");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{this.f183081d, this.f183082e, this.f183083f});
    }

    public /* synthetic */ r0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3);
        super.replaceDefault(this.f183084g, new java.lang.Object[]{this.f183081d, this.f183082e, this.f183083f});
    }

    public r0(java.lang.String plainText, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(plainText, "plainText");
        this.f183081d = plainText;
        this.f183082e = str;
        this.f183083f = str2;
        super.replaceDefault(this.f183084g, new java.lang.Object[]{plainText, str, str2});
    }
}
