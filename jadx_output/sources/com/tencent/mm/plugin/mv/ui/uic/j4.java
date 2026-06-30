package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class j4 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.v4 f151218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.c3 f151219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f151220f;

    public j4(com.tencent.mm.plugin.mv.ui.uic.v4 v4Var, com.tencent.mm.plugin.mv.ui.uic.c3 c3Var, java.util.HashMap hashMap) {
        this.f151218d = v4Var;
        this.f151219e = c3Var;
        this.f151220f = hashMap;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.ny3 ny3Var;
        o01.a aVar = (o01.a) obj;
        int i17 = com.tencent.mm.plugin.mv.ui.uic.i4.f151202a[aVar.f359284a.ordinal()];
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 1) {
            com.tencent.mm.plugin.mv.ui.uic.v4 v4Var = this.f151218d;
            android.app.ProgressDialog progressDialog = v4Var.f151497q;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            int i18 = aVar.f359286c;
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFlexEditUIC", "errType:" + aVar.f359285b + ", errCode:" + i18);
            } else {
                java.lang.Object value = this.f151219e.f151077g.getValue();
                if (value != null && (ny3Var = aVar.f359289f) != null) {
                    java.util.LinkedList list = ((r45.rr4) ny3Var).getList(1);
                    kotlin.jvm.internal.o.f(list, "getRes_list(...)");
                    r45.ss4 O6 = com.tencent.mm.plugin.mv.ui.uic.v4.O6(v4Var, (r45.ss4) value, list, this.f151220f);
                    O6.set(2, "");
                    android.content.Intent intent = new android.content.Intent(v4Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI.class);
                    intent.putExtra("key_track_data", O6.toByteArray());
                    intent.putExtra("key_seek_to_start", true);
                    pm0.v.g(intent, v4Var.getActivity().getIntent(), "key_mv_from_scene", 0);
                    androidx.appcompat.app.AppCompatActivity activity = v4Var.getActivity();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFlexEditUIC", "handleArrangementResp", "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activity, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFlexEditUIC", "handleArrangementResp", "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList musicMvFlexLiveList = v4Var.f151491h;
                    java.util.ArrayList arrayList2 = musicMvFlexLiveList.f152065o;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (((gm3.c) next).f273549m > 0) {
                            arrayList3.add(next);
                        }
                    }
                    int size = arrayList3.size();
                    fm3.g0.f264070a.a((musicMvFlexLiveList.f152065o.size() - size) - 1, size);
                }
            }
        }
        return f0Var;
    }
}
