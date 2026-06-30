package ed0;

/* loaded from: classes10.dex */
public interface r0 {
    static com.tencent.mm.view.recyclerview.WxRecyclerAdapter n6(ed0.r0 r0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initRingtoneSelectListAdapter");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        final com.tencent.mm.plugin.ringtone.uic.v vVar = (com.tencent.mm.plugin.ringtone.uic.v) r0Var;
        vVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((vVar.f158498d == 1) && z17) {
            t45.n0 n0Var = new t45.n0();
            n0Var.f415615d = 3;
            arrayList.add(new ox3.g(n0Var));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC$initRingtoneSelectListAdapter$adapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataUIC", "getItemConvert, type:" + type);
                androidx.appcompat.app.AppCompatActivity activity = com.tencent.mm.plugin.ringtone.uic.v.this.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                int i18 = ((com.tencent.mm.plugin.ringtone.uic.c3) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class)).f158374f;
                return type != -3 ? type != -2 ? type != -1 ? com.tencent.mm.plugin.ringtone.uic.v.this.Q6() ? new ox3.f0(i18, new com.tencent.mm.plugin.ringtone.uic.k(com.tencent.mm.plugin.ringtone.uic.v.this), new com.tencent.mm.plugin.ringtone.uic.l(com.tencent.mm.plugin.ringtone.uic.v.this), new com.tencent.mm.plugin.ringtone.uic.m(com.tencent.mm.plugin.ringtone.uic.v.this), new com.tencent.mm.plugin.ringtone.uic.n(com.tencent.mm.plugin.ringtone.uic.v.this)) : new ox3.k(i18, new com.tencent.mm.plugin.ringtone.uic.o(com.tencent.mm.plugin.ringtone.uic.v.this), new com.tencent.mm.plugin.ringtone.uic.p(com.tencent.mm.plugin.ringtone.uic.v.this)) : new ox3.o() : new ox3.t() : new ox3.m();
            }
        }, arrayList, true);
        wxRecyclerAdapter.setHasStableIds(true);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.ringtone.uic.j(vVar);
        vVar.f158503i = wxRecyclerAdapter;
        return wxRecyclerAdapter;
    }
}
