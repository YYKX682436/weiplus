package f53;

/* loaded from: classes15.dex */
public class m extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public int f259674d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f259675e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f259676f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView f259677g;

    public m(com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView) {
        this.f259677g = atSomeoneView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f259674d;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        f53.l lVar = (f53.l) k3Var;
        com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView = this.f259677g;
        boolean z17 = atSomeoneView.f139983p2 == i17;
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f259675e;
        o33.f fVar = (o33.f) linkedList.get(i17);
        android.widget.ImageView imageView = lVar.f259667e;
        imageView.setVisibility(8);
        if (fVar != null) {
            boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
            f53.m mVar = lVar.f259671i;
            android.widget.ImageView imageView2 = lVar.f259666d;
            if (n17) {
                java.lang.String str = fVar.f342739f;
                com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView2 = mVar.f259677g;
                if (((lt0.f) atSomeoneView2.f139977j2).k(str)) {
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) atSomeoneView2.f139977j2).get(str);
                    if (bitmap == null || bitmap.isRecycled()) {
                        r53.v vVar = new r53.v();
                        vVar.f392703a = false;
                        vVar.f392709g = 0.083333336f;
                        r53.y.a().e(imageView2, str, vVar.a(), new f53.k(mVar, str));
                    } else {
                        imageView2.setImageBitmap(bitmap);
                    }
                } else {
                    r53.v vVar2 = new r53.v();
                    vVar2.f392703a = false;
                    vVar2.f392709g = 0.083333336f;
                    r53.y.a().e(imageView2, str, vVar2.a(), new f53.k(mVar, str));
                }
            } else {
                o11.f fVar2 = new o11.f();
                fVar2.f342096t = true;
                n11.a.b().h(fVar.f342739f, imageView2, fVar2.a());
            }
            lVar.f259668f.setText(fVar.f342738e);
            lVar.f259669g.setText(fVar.f342740g);
            if (mVar.f259677g.f139981n2.contains(fVar.f342737d)) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (com.tencent.mm.ui.bk.C()) {
            imageView.setImageResource(com.tencent.mm.R.raw.game_at_select_someone_box_dark);
        } else {
            imageView.setImageResource(com.tencent.mm.R.raw.game_at_select_someone_box);
        }
        if (z17) {
            android.view.View view = lVar.f259670h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$AtSomeoneAdapter$AtSomeoneViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/luggage/game/RemindUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$AtSomeoneAdapter$AtSomeoneViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/luggage/game/RemindUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = lVar.f259670h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$AtSomeoneAdapter$AtSomeoneViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/luggage/game/RemindUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$AtSomeoneAdapter$AtSomeoneViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/luggage/game/RemindUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        o33.f fVar3 = (o33.f) linkedList.get(i17);
        if (fVar3 != null) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f259676f;
            if (arrayList3.contains(fVar3.f342737d)) {
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.google.android.gms.common.Scopes.OPEN_ID, fVar3.f342737d);
            hashMap.put("is_search", atSomeoneView.f139984q2 ? "1" : "0");
            com.tencent.mm.game.report.l.c(atSomeoneView.f139974g2, 101, 1, i17 + 1, 1, 0, com.tencent.mm.game.report.l.b(hashMap));
            arrayList3.add(fVar3.f342737d);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new f53.l(this, android.view.LayoutInflater.from(this.f259677g.f139974g2).inflate(com.tencent.mm.R.layout.bdw, (android.view.ViewGroup) null));
    }
}
