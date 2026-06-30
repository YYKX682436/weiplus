package com.tencent.mm.plugin.webview.model;

/* loaded from: classes5.dex */
public class q0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f183064d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f183065e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f183066f;

    /* renamed from: g, reason: collision with root package name */
    public final int f183067g;

    public q0() {
        this(null, null, null, 7, null);
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.t(-1, "chatRecords", com.tencent.mm.plugin.webview.model.r0.class, "")});
        this.f183067g = appendAttrs;
        super.set__serialName("chatLogInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{this.f183064d, this.f183065e, this.f183066f});
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f183067g + 2);
    }

    public /* synthetic */ q0(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? new java.util.LinkedList() : linkedList);
        super.replaceDefault(this.f183067g, new java.lang.Object[]{this.f183064d, this.f183065e, this.f183066f});
    }

    public q0(java.lang.String scene, java.lang.String title, java.util.LinkedList<com.tencent.mm.plugin.webview.model.r0> chatRecords) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(chatRecords, "chatRecords");
        this.f183064d = scene;
        this.f183065e = title;
        this.f183066f = chatRecords;
        super.replaceDefault(this.f183067g, new java.lang.Object[]{scene, title, chatRecords});
    }
}
