package mz0;

/* loaded from: classes5.dex */
public final /* synthetic */ class r0 extends kotlin.jvm.internal.m implements yz5.a {
    public r0(java.lang.Object obj) {
        super(0, obj, mz0.b2.class, "refreshMusicPickerListUI", "refreshMusicPickerListUI()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.b2 b2Var = (mz0.b2) this.receiver;
        android.app.Activity context = b2Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.util.List<? extends com.tencent.maas.model.MJMusicInfo> list = (java.util.List) ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).f69789m.f245052c.getValue();
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        b2Var.o7().getClass();
        zy0.e eVar = (zy0.e) ((dz0.f) b2Var.G.getValue());
        eVar.getClass();
        if (list.hashCode() != eVar.f477319h) {
            list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.maas.model.MJMusicInfo) it.next()).getSongName());
            }
            com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ",");
            eVar.f477319h = list.hashCode();
            ((com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout) eVar.f477321j.getValue()).setLocalMJMusicInfoList(list);
        }
        return jz5.f0.f302826a;
    }
}
