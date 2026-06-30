package com.tencent.mm.plugin.recordvideo.ui.editor.audio;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderLikeFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class EditorAudioFinderLikeFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment {

    /* renamed from: p, reason: collision with root package name */
    public wt3.p0 f156099p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f156100q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorAudioFinderLikeFragment(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        gm0.j1.d().a(3965, this);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment
    public void c() {
        this.f156099p = new wt3.p0(this.f156100q);
        gm0.j1.d().g(this.f156099p);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment
    public void e() {
        super.e();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == null || !kotlin.jvm.internal.o.b(this.f156099p, m1Var)) {
            return;
        }
        this.f156099p = null;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.modelbase.o oVar = ((wt3.p0) m1Var).f449467d;
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
            this.f156100q = ((r45.d71) fVar).getByteString(2);
            com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
            java.util.LinkedList list = ((r45.d71) fVar2).getList(1);
            kotlin.jvm.internal.o.f(list, "getLiked_list(...)");
            com.tencent.mm.protobuf.f fVar3 = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
            d(list, ((r45.d71) fVar3).getInteger(3) != 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorAudioFinderLikeFragment(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        gm0.j1.d().a(3965, this);
    }
}
