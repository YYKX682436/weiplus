package nm4;

/* loaded from: classes3.dex */
public final class t implements ff0.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.widget.TingSpaceCoverMvvmView f338512a;

    public t(com.tencent.mm.plugin.ting.widget.TingSpaceCoverMvvmView tingSpaceCoverMvvmView) {
        this.f338512a = tingSpaceCoverMvvmView;
    }

    @Override // ff0.x
    public void a(ff0.z zVar) {
        if (zVar != null) {
            int i17 = zVar.f261595a | (-16777216);
            com.tencent.mm.plugin.ting.widget.TingSpaceCoverMvvmView tingSpaceCoverMvvmView = this.f338512a;
            tingSpaceCoverMvvmView.post(new nm4.s(tingSpaceCoverMvvmView, i17));
        }
    }
}
