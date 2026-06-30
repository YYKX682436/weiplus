package nu0;

/* loaded from: classes5.dex */
public final class d4 extends du0.p1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // du0.p1
    public void C6() {
        c7().C6();
        nu0.i iVar = (nu0.i) T6(nu0.i.class);
        iVar.V6("edit_bgm", "view_clk", iVar.U6());
    }

    @Override // du0.p1
    public boolean Y6(boolean z17) {
        ev0.c cVar = this.f243414q;
        if (cVar == null) {
            return true;
        }
        ev0.t.c(cVar.f222353c, false, null, 3, null);
        return true;
    }

    @Override // du0.p1
    public yt0.c m7() {
        return (yt0.c) T6(nu0.b4.class);
    }

    @Override // du0.p1, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        super.onResume();
        ev0.c cVar = this.f243414q;
        if (cVar != null) {
            cVar.f222353c.d();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        ev0.c cVar = this.f243414q;
        if (cVar != null) {
            ev0.t.c(cVar.f222353c, false, null, 3, null);
        }
    }

    @Override // du0.p1
    public void p7(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, boolean z18) {
        ev0.c cVar = this.f243414q;
        if (cVar != null) {
            cVar.f222353c.d();
        }
    }
}
