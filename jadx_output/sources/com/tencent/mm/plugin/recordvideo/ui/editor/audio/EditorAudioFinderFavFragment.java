package com.tencent.mm.plugin.recordvideo.ui.editor.audio;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderFavFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class EditorAudioFinderFavFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment {

    /* renamed from: p, reason: collision with root package name */
    public wt3.o0 f156097p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f156098q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorAudioFinderFavFragment(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        gm0.j1.d().a(3966, this);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment
    public void c() {
        this.f156097p = new wt3.o0(this.f156098q);
        gm0.j1.d().g(this.f156097p);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment
    public void e() {
        super.e();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == null || !kotlin.jvm.internal.o.b(this.f156097p, m1Var)) {
            return;
        }
        this.f156097p = null;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.modelbase.o oVar = ((wt3.o0) m1Var).f449461d;
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
            this.f156098q = ((r45.x51) fVar).getByteString(2);
            com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
            java.util.LinkedList list = ((r45.x51) fVar2).getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            com.tencent.mm.protobuf.f fVar3 = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
            d(list, ((r45.x51) fVar3).getInteger(3) != 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorAudioFinderFavFragment(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        gm0.j1.d().a(3966, this);
    }
}
