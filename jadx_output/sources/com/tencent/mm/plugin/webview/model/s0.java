package com.tencent.mm.plugin.webview.model;

/* loaded from: classes5.dex */
public class s0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f183095d;

    /* renamed from: e, reason: collision with root package name */
    public final int f183096e;

    /* JADX WARN: Multi-variable type inference failed */
    public s0() {
        this(null, 1, 0 == true ? 1 : 0);
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.t(-1, "files", com.tencent.mm.plugin.webview.model.p0.class, "")});
        this.f183096e = appendAttrs;
        super.set__serialName("fileCdnInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{this.f183095d});
    }

    public java.util.LinkedList getFiles() {
        return super.getLinkedList(this.f183096e + 0);
    }

    public /* synthetic */ s0(java.util.LinkedList linkedList, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? new java.util.LinkedList() : linkedList);
        super.replaceDefault(this.f183096e, new java.lang.Object[]{this.f183095d});
    }

    public s0(java.util.LinkedList<com.tencent.mm.plugin.webview.model.p0> files) {
        kotlin.jvm.internal.o.g(files, "files");
        this.f183095d = files;
        super.replaceDefault(this.f183096e, new java.lang.Object[]{files});
    }
}
