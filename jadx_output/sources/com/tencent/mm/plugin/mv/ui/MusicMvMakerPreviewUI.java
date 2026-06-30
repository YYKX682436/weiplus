package com.tencent.mm.plugin.mv.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvMakerPreviewUI extends com.tencent.mm.plugin.mv.ui.BaseMusicMvUI {

    /* renamed from: e, reason: collision with root package name */
    public r45.ss4 f150866e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f150867f;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489325c54;
    }

    @Override // com.tencent.mm.plugin.mv.ui.BaseMusicMvUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.mv.ui.uic.h6.class, com.tencent.mm.plugin.mv.ui.uic.t6.class, com.tencent.mm.plugin.mv.ui.uic.k6.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.mv.ui.BaseMusicMvUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.ef2 mvInfo;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        r45.ef2 mvInfo2;
        java.util.LinkedList list;
        boolean z17;
        java.util.LinkedList list2;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        r45.ss4 ss4Var;
        super.onCreate(bundle);
        hideTitleView();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.aa8);
        com.tencent.mm.sdk.platformtools.t8.q(findViewById, 200, 200, 200, 200);
        findViewById.setOnClickListener(new jm3.b(this));
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
        hideActionbarLine();
        this.f150866e = new r45.ss4();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_track_data");
        if (byteArrayExtra != null && (ss4Var = this.f150866e) != null) {
            ss4Var.parseFrom(byteArrayExtra);
        }
        kl3.t.g().a().c(0);
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.mv.ui.uic.h6.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.h6 h6Var = (com.tencent.mm.plugin.mv.ui.uic.h6) a17;
        r45.ss4 ss4Var2 = this.f150866e;
        r45.hf2 hf2Var = null;
        h6Var.f151180e = ss4Var2 != null ? ss4Var2.getString(2) : null;
        r45.ss4 ss4Var3 = this.f150866e;
        h6Var.f151181f = (ss4Var3 == null || (finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var3.getCustom(0)) == null || (objectDesc3 = finderObject3.getObjectDesc()) == null || (media = objectDesc3.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) ? null : finderMedia.getThumbUrl() + finderMedia.getThumb_url_token();
        h6Var.Q6(new jm3.c());
        h6Var.f151182g = this.f150866e;
        h6Var.R6(new jm3.e(this));
        androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.mv.ui.uic.t6.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.t6 t6Var = (com.tencent.mm.plugin.mv.ui.uic.t6) a18;
        h6Var.f151183h = new jm3.f(t6Var);
        t6Var.f151467o = new jm3.g(h6Var);
        r45.ss4 ss4Var4 = this.f150866e;
        t6Var.f151459d = ss4Var4;
        java.util.ArrayList arrayList = t6Var.f151460e;
        if (ss4Var4 != null && (finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var4.getCustom(0)) != null && (objectDesc2 = finderObject2.getObjectDesc()) != null && (mvInfo2 = objectDesc2.getMvInfo()) != null && (list = mvInfo2.getList(0)) != null) {
            int i17 = 0;
            for (java.lang.Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.jf2 jf2Var = (r45.jf2) obj;
                if (jf2Var.getLong(2) != 0) {
                    r45.ss4 ss4Var5 = t6Var.f151459d;
                    if (ss4Var5 != null && (list2 = ss4Var5.getList(1)) != null) {
                        z17 = false;
                        int i19 = 0;
                        for (java.lang.Object obj2 : list2) {
                            int i27 = i19 + 1;
                            if (i19 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            if (((com.tencent.mm.protocal.protobuf.FinderObject) obj2).getId() == jf2Var.getLong(2)) {
                                com.tencent.mm.plugin.mv.ui.uic.l6 l6Var = new com.tencent.mm.plugin.mv.ui.uic.l6(t6Var, i19, 0);
                                l6Var.f151276e = jf2Var;
                                arrayList.add(l6Var);
                                z17 = true;
                            }
                            i19 = i27;
                        }
                    }
                    z17 = false;
                } else {
                    java.lang.String string = jf2Var.getString(3);
                    if (!(string == null || string.length() == 0)) {
                        com.tencent.mm.plugin.mv.ui.uic.l6 l6Var2 = new com.tencent.mm.plugin.mv.ui.uic.l6(t6Var, i17, 0);
                        l6Var2.f151276e = jf2Var;
                        l6Var2.f151277f = true;
                        arrayList.add(l6Var2);
                        z17 = true;
                    }
                    z17 = false;
                }
                if (!z17) {
                    com.tencent.mm.plugin.mv.ui.uic.l6 l6Var3 = new com.tencent.mm.plugin.mv.ui.uic.l6(t6Var, i17, 0);
                    l6Var3.f151276e = jf2Var;
                    l6Var3.f151277f = true;
                    arrayList.add(l6Var3);
                }
                i17 = i18;
            }
        }
        com.tencent.mm.plugin.mv.ui.uic.l6 l6Var4 = (com.tencent.mm.plugin.mv.ui.uic.l6) kz5.n0.Z(arrayList);
        if (l6Var4 != null) {
            l6Var4.f151278g = true;
        }
        t6Var.f151463h = 0;
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.mv.ui.uic.q6(t6Var, null), 2, null);
        t6Var.f151461f = (com.tencent.mm.view.recyclerview.WxRecyclerView) t6Var.getActivity().findViewById(com.tencent.mm.R.id.byj);
        android.view.View view = new android.view.View(t6Var.getActivity());
        view.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(i65.a.b(t6Var.getActivity(), 24), i65.a.b(t6Var.getActivity(), 64)));
        in5.n0.U(t6Var.O6(), view, -1, false, 4, null);
        android.view.View view2 = new android.view.View(t6Var.getActivity());
        view2.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(i65.a.b(t6Var.getActivity(), 24), i65.a.b(t6Var.getActivity(), 64)));
        in5.n0.P(t6Var.O6(), view2, -2, false, 4, null);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = t6Var.f151461f;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager((com.tencent.mm.plugin.mv.ui.view.SpeedyLinearLayoutManager) ((jz5.n) t6Var.f151466n).getValue());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = t6Var.f151461f;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(t6Var.O6());
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.c8v);
        if (button != null) {
            button.setOnClickListener(new jm3.h(this));
        }
        com.tencent.mm.plugin.mv.ui.uic.k6 k6Var = (com.tencent.mm.plugin.mv.ui.uic.k6) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.mv.ui.uic.k6.class);
        r45.ss4 ss4Var6 = this.f150866e;
        if (ss4Var6 != null && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var6.getCustom(0)) != null && (objectDesc = finderObject.getObjectDesc()) != null && (mvInfo = objectDesc.getMvInfo()) != null) {
            hf2Var = (r45.hf2) mvInfo.getCustom(1);
        }
        k6Var.f151253e = hf2Var;
        ((com.tencent.mm.plugin.mv.ui.uic.k6) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.mv.ui.uic.k6.class)).O6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ll3.z0.a(ll3.z0.f319264a, false, 1, null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f150867f) {
            return;
        }
        this.f150867f = false;
    }
}
