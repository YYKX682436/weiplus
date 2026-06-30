package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = com.tencent.mm.ui.chatting.component.lg.class)
/* loaded from: classes4.dex */
public class ol extends com.tencent.mm.ui.chatting.component.a implements com.tencent.mm.ui.chatting.component.lg {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f199649e = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f199650f = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: g, reason: collision with root package name */
    public boolean f199651g = true;

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f199652h = new android.util.SparseArray();

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryStateComponent", "onChattingEnterAnimEnd: hashCode:%s", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryStateComponent", "onComponentUnInstall: hashCode:%s", java.lang.Integer.valueOf(hashCode()));
        this.f199649e.clear();
        this.f199652h.clear();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryStateComponent", "onChattingExitAnimStart: hashCode:%s", java.lang.Integer.valueOf(hashCode()));
        this.f199649e.clear();
        this.f199652h.clear();
        com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct storyPreviewReportStruct = mf4.d.f326163d;
        storyPreviewReportStruct.f60921g = storyPreviewReportStruct.b("SourceUserName", "", false);
        com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct storyPreviewReportStruct2 = mf4.d.f326163d;
        storyPreviewReportStruct2.f60920f = 0L;
        storyPreviewReportStruct2.f60922h = 0L;
        com.tencent.mm.autogen.mmdata.rpt.StoryDoubleTapHeadViewStruct storyDoubleTapHeadViewStruct = mf4.d.f326170k;
        storyDoubleTapHeadViewStruct.f60892d = storyDoubleTapHeadViewStruct.b("SourceUserName", "", true);
        storyDoubleTapHeadViewStruct.f60893e = 0L;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        long j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryStateComponent", "onChattingResume: hashCode:%s", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.autogen.mmdata.rpt.StoryDoubleTapHeadViewStruct storyDoubleTapHeadViewStruct = mf4.d.f326170k;
        int i17 = 1;
        storyDoubleTapHeadViewStruct.f60892d = storyDoubleTapHeadViewStruct.b("SourceUserName", this.f198580d.x(), true);
        if (this.f199651g) {
            j17 = 2;
        } else {
            java.lang.String x17 = this.f198580d.x();
            if (android.text.TextUtils.isEmpty(x17)) {
                i17 = 0;
            } else if (!kotlin.jvm.internal.o.b(ef4.w.f252468t.e(), x17)) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(x17, true);
                i17 = n17.t2() ? 3 : n17.r2() ? 4 : 5;
            }
            j17 = i17;
        }
        storyDoubleTapHeadViewStruct.f60893e = j17;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryStateComponent", "onChattingPause: hashCode:%s", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryStateComponent", "onChattingEnterAnimStart: user %s hashCode:%s", this.f198580d.x(), java.lang.Integer.valueOf(hashCode()));
        this.f198580d.f460717l.removeOptionMenu(3);
        this.f199649e.clear();
        this.f199650f.clear();
        ((com.tencent.mm.ui.chatting.component.f7) ((sb5.e0) this.f198580d.f460708c.a(sb5.e0.class))).f199016f = 0;
        java.lang.String x17 = this.f198580d.x();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
            this.f199651g = com.tencent.mm.storage.z3.R4(x17);
        }
        com.tencent.mm.autogen.mmdata.rpt.StoryChatTopBarEntranceExposeStruct storyChatTopBarEntranceExposeStruct = mf4.d.f326169j;
        storyChatTopBarEntranceExposeStruct.f60864d = storyChatTopBarEntranceExposeStruct.b("UserName", this.f198580d.x(), true);
        boolean z17 = this.f199651g;
        storyChatTopBarEntranceExposeStruct.f60865e = z17 ? 4L : 5L;
        storyChatTopBarEntranceExposeStruct.f60866f = 0L;
        if (z17) {
            this.f198580d.f460723r = com.tencent.mm.ui.x2.a(java.lang.String.valueOf(4L));
        } else {
            this.f198580d.f460723r = com.tencent.mm.ui.x2.a(java.lang.String.valueOf(5L));
        }
    }
}
