package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public interface d1 extends fs.n {
    boolean Fc(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo);

    void Ob(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo, boolean z17);

    default void Y9(java.lang.String eventId, java.lang.String imgSourceUrl, int i17) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(imgSourceUrl, "imgSourceUrl");
    }

    java.lang.String Ze(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo);

    java.lang.String dd(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo);

    java.lang.String ge(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo);
}
