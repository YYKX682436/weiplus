package com.tencent.mm.plugin.webview.emojistore.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/emojistore/ui/SosSimilarUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/modelbase/u0;", "Lcom/tencent/mm/feature/emoji/api/y6;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class SosSimilarUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.modelbase.u0, com.tencent.mm.feature.emoji.api.y6 {

    /* renamed from: d, reason: collision with root package name */
    public final iw4.d f182050d = new iw4.d();

    /* renamed from: e, reason: collision with root package name */
    public final lr.n0 f182051e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f182052f;

    /* renamed from: g, reason: collision with root package name */
    public int f182053g;

    /* renamed from: h, reason: collision with root package name */
    public long f182054h;

    public SosSimilarUI() {
        ((com.tencent.mm.feature.emoji.u0) ((com.tencent.mm.feature.emoji.api.a6) i95.n0.c(com.tencent.mm.feature.emoji.api.a6.class))).getClass();
        this.f182051e = new a85.a();
    }

    public final int U6() {
        int g17 = com.tencent.mm.ui.bk.g();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int i17 = (g17 - (((int) ((108.0f * context.getResources().getDisplayMetrics().density) + 0.5f)) * 3)) / 8;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosSimilarUI", "recycler view padding :" + i17);
        if (i17 > 0) {
            return i17;
        }
        return 0;
    }

    public final void V6(com.tencent.mm.api.IEmojiInfo emojiInfo, boolean z17) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        int i17 = z17 ? 1 : 2;
        jx3.f fVar = jx3.f.INSTANCE;
        iw4.d dVar = this.f182050d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(dVar.c() ? 59 : 78);
        java.lang.String str = dVar.f295249i;
        fVar.d(18742, valueOf, str, str, str, java.lang.Integer.valueOf(i17), emojiInfo.getMd5());
    }

    public final void W6() {
        java.lang.String str;
        int i17 = this.f182053g;
        lr.n0 n0Var = this.f182051e;
        if (i17 < ((a85.a) n0Var).f2386q) {
            r45.lq5 lq5Var = new r45.lq5();
            iw4.d dVar = this.f182050d;
            int i18 = 0;
            java.lang.String str2 = "";
            if (dVar.c()) {
                for (java.lang.Object obj : dVar.f295251n) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    ir.g gVar = (ir.g) obj;
                    if (i18 > this.f182053g && i18 <= ((a85.a) n0Var).f2386q - 2) {
                        str2 = str2 + gVar.f293836b.getMd5() + ';';
                    }
                    i18 = i19;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("logid=17368&sessionid=");
                sb6.append(dVar.f295249i);
                sb6.append("&searchid=");
                sb6.append(dVar.f295249i);
                sb6.append("&scene=59&md5=");
                com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel = dVar.f295245e;
                sb6.append(similarEmojiQueryModel != null ? similarEmojiQueryModel.f193150e : null);
                sb6.append("&md5content=");
                sb6.append(str2);
                sb6.append("&pos=");
                sb6.append(this.f182053g + 2);
                sb6.append("&clienttimestamp=");
                sb6.append(java.lang.System.currentTimeMillis());
                sb6.append("&tab=0&requestid=");
                sb6.append(dVar.f295249i);
                lq5Var.f379756t = sb6.toString();
            } else {
                java.lang.String str3 = "";
                for (java.lang.Object obj2 : dVar.f295251n) {
                    int i27 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    ir.g gVar2 = (ir.g) obj2;
                    if (i18 > this.f182053g && i18 <= ((a85.a) n0Var).f2386q - 2) {
                        str3 = str3 + "256:" + gVar2.f293838d + ':' + c01.id.c() + ';';
                    }
                    i18 = i27;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isexpose=1&searchid=");
                sb7.append(dVar.f295249i);
                sb7.append("&content=");
                sb7.append(str3);
                sb7.append("&query=");
                com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel2 = dVar.f295245e;
                if (similarEmojiQueryModel2 != null && (str = similarEmojiQueryModel2.f193149d) != null) {
                    str2 = str;
                }
                sb7.append(str2);
                sb7.append("&ishomepage=0&&sessionid=");
                sb7.append(dVar.f295248h);
                sb7.append("&scene=78&logtype=1&requestid=");
                sb7.append(dVar.f295249i);
                sb7.append("&pageno=");
                sb7.append(dVar.f295247g);
                lq5Var.f379756t = sb7.toString();
            }
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
            gm0.j1.d().g(new su4.a2(lq5Var));
            this.f182053g = ((a85.a) n0Var).f2386q;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosSimilarUI", lq5Var.f379756t);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
        android.content.Intent intent = getIntent();
        iw4.d dVar = this.f182050d;
        dVar.getClass();
        kotlin.jvm.internal.o.g(intent, "intent");
        gm0.j1.d().a(2999, dVar);
        gm0.j1.d().a(719, dVar);
        dVar.f295245e = (com.tencent.mm.search.data.SimilarEmojiQueryModel) intent.getParcelableExtra("KEY_NET_PARAM");
        r45.h66 h66Var = (r45.h66) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ri(this, 1, 1, r45.h66.class);
        if (h66Var != null) {
            java.lang.String str = h66Var.f375882d;
            if (str == null) {
                str = "";
            }
            dVar.f295248h = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.SimilarEmoji", "report sessionId=" + dVar.f295248h);
        }
        com.tencent.mm.feature.emoji.api.a7 a7Var = (com.tencent.mm.feature.emoji.api.a7) i95.n0.c(com.tencent.mm.feature.emoji.api.a7.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.xb xbVar = new com.tencent.mm.ui.xb(context, com.tencent.mm.R.style.f494155fn);
        ((com.tencent.mm.feature.emoji.eb) a7Var).getClass();
        com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarEmojiRecyclerView sosSimilarEmojiRecyclerView = new com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarEmojiRecyclerView(xbVar);
        this.f182052f = sosSimilarEmojiRecyclerView;
        sosSimilarEmojiRecyclerView.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
        android.view.ViewParent viewParent = this.f182052f;
        com.tencent.mm.feature.emoji.api.z6 z6Var = viewParent instanceof com.tencent.mm.feature.emoji.api.z6 ? (com.tencent.mm.feature.emoji.api.z6) viewParent : null;
        if (z6Var != null) {
            z6Var.setOnLoadingStateChangedListener(this);
        }
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        com.tencent.mm.view.TouchableLayout touchableLayout = new com.tencent.mm.view.TouchableLayout(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f182052f;
        if (recyclerView != null) {
            recyclerView.setPadding(U6(), 0, U6(), 0);
        }
        touchableLayout.addView(this.f182052f, layoutParams);
        setContentView(touchableLayout, layoutParams);
        com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel = dVar.f295245e;
        if (similarEmojiQueryModel == null || (string = similarEmojiQueryModel.f193149d) == null) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jia);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        }
        setMMTitle(string);
        setBackBtn(new iw4.e(this));
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(getContext(), 3);
        gridLayoutManager.B = new iw4.f(this, gridLayoutManager);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f182052f;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(gridLayoutManager);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f182052f;
        if (recyclerView3 != null) {
            recyclerView3.setItemViewCacheSize(0);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f182052f;
        lr.n0 n0Var = this.f182051e;
        if (recyclerView4 != null) {
            kotlin.jvm.internal.o.e(n0Var, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
            recyclerView4.setAdapter((androidx.recyclerview.widget.f2) n0Var);
        }
        ((lr.z) n0Var).f320620g = new iw4.j(this);
        a85.a aVar = (a85.a) n0Var;
        aVar.f2384o = false;
        com.tencent.mm.api.IEmojiInfo a17 = dVar.a();
        if (a17 != null) {
            if (dVar.c()) {
                aVar.I(a17);
            } else {
                aVar.J(a17);
            }
            aVar.x(aVar.getItemCount(), new ir.z0(105));
        }
        n0Var.notifyDataSetChanged();
        dVar.b(this);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1257L, 3L);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        W6();
        super.onDestroy();
        iw4.d dVar = this.f182050d;
        dVar.f295244d = null;
        gm0.j1.n().f273288b.c(2999);
        gm0.j1.n().f273288b.q(2999, dVar);
        gm0.j1.n().f273288b.c(719);
        gm0.j1.d().q(719, dVar);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.view.ViewParent viewParent = this.f182052f;
        com.tencent.mm.feature.emoji.api.z6 z6Var = viewParent instanceof com.tencent.mm.feature.emoji.api.z6 ? (com.tencent.mm.feature.emoji.api.z6) viewParent : null;
        if (z6Var != null) {
            com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView similarEmojiLoadMoreRecyclerView = (com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView) z6Var;
            if (similarEmojiLoadMoreRecyclerView.f182049v2) {
                similarEmojiLoadMoreRecyclerView.f182049v2 = false;
            }
        }
        lr.m0 m0Var = this.f182051e;
        iw4.d dVar = this.f182050d;
        if (i17 == 0 && i18 == 0 && dVar.f295251n.size() > 1) {
            lr.z zVar = (lr.z) m0Var;
            int itemCount = zVar.getItemCount();
            ((a85.a) m0Var).f2384o = true;
            zVar.E(dVar.f295251n);
            if (itemCount - 2 <= 0) {
                m0Var.notifyDataSetChanged();
                return;
            }
            m0Var.notifyItemChanged(itemCount - 1);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosSimilarUI", "onSceneEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + ' ');
            java.util.ArrayList arrayList = new java.util.ArrayList();
            a85.a aVar = (a85.a) m0Var;
            aVar.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.yk5 yk5Var = (r45.yk5) it.next();
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
                r45.ri0 ri0Var = yk5Var.f391180d;
                java.lang.String str2 = yk5Var.f391181e;
                n22.m.a(ri0Var, emojiInfo);
                emojiInfo.H2 = str2;
                int i19 = yk5Var.f391182f;
                int i27 = i19 & 1;
                if (i27 == 0) {
                    emojiInfo.G2 = 1;
                }
                if (i27 == 0 && (i19 & 16) == 0) {
                    emojiInfo.F2 = 1;
                }
                emojiInfo.field_catalog = 65;
                emojiInfo.field_groupId = yk5Var.f391180d.f384892m;
                arrayList2.add(new ir.g(emojiInfo, 102, null, 0, 12, null));
            }
            aVar.E(arrayList2);
            com.tencent.mm.api.IEmojiInfo a17 = dVar.a();
            if (a17 != null) {
                if (dVar.c()) {
                    aVar.I(a17);
                } else {
                    aVar.J(a17);
                }
            }
            aVar.x(aVar.getItemCount(), new ir.z0(106));
            m0Var.notifyDataSetChanged();
        }
        W6();
    }
}
