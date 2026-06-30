package t61;

/* loaded from: classes9.dex */
public class d implements fb5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.widget.RecoverFriendSortView f415987a;

    public d(com.tencent.mm.plugin.account.friend.widget.RecoverFriendSortView recoverFriendSortView) {
        this.f415987a = recoverFriendSortView;
    }

    @Override // fb5.l
    public android.view.View a(fb5.n nVar, android.view.View view, android.view.ViewGroup viewGroup, int i17, int i18, boolean z17, boolean z18) {
        t61.e eVar;
        com.tencent.mm.plugin.account.friend.widget.RecoverFriendSortView recoverFriendSortView = this.f415987a;
        if (view == null) {
            view = android.view.View.inflate(recoverFriendSortView.getContext(), com.tencent.mm.R.layout.cde, null);
            eVar = new t61.e(recoverFriendSortView);
            eVar.f415988a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485059ge4);
            eVar.f415989b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.get);
            eVar.f415990c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bdd);
            eVar.f415991d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.geq);
            eVar.f415992e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482712lv);
            eVar.f415993f = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.f482692lf);
        } else {
            eVar = (t61.e) view.getTag();
        }
        r61.y1 y1Var = (r61.y1) nVar.f260898b;
        eVar.f415994g = y1Var;
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(eVar.f415988a, y1Var.f393000a.field_encryptUsername, null);
        android.widget.TextView textView = eVar.f415989b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = view.getContext();
        java.lang.String str = y1Var.f393000a.field_nickname;
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
        com.tencent.mm.storage.p7 p7Var = y1Var.f393001b;
        if (p7Var == null || com.tencent.mm.sdk.platformtools.t8.K0(p7Var.field_msgContent)) {
            eVar.f415991d.setVisibility(8);
        } else {
            eVar.f415991d.setVisibility(0);
            android.widget.TextView textView2 = eVar.f415989b;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = view.getContext();
            java.lang.String str2 = p7Var.field_msgContent;
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, str2));
        }
        if (recoverFriendSortView.f197872p && z17) {
            eVar.f415990c.setText(nVar.f260897a);
            eVar.f415990c.setVisibility(0);
        } else {
            eVar.f415990c.setVisibility(8);
        }
        if ((!com.tencent.mm.sdk.platformtools.t8.K0(y1Var.f393000a.field_encryptUsername) && c01.e2.J(y1Var.f393000a.field_encryptUsername)) || (!com.tencent.mm.sdk.platformtools.t8.K0(y1Var.f393000a.field_username) && c01.e2.J(y1Var.f393000a.field_username))) {
            eVar.f415992e.setVisibility(0);
            eVar.f415992e.setText(com.tencent.mm.R.string.f490006i8);
            eVar.f415993f.setVisibility(8);
        } else if (y1Var.f393000a.field_addState == 1) {
            eVar.f415992e.setVisibility(0);
            eVar.f415992e.setText(com.tencent.mm.R.string.ffg);
            eVar.f415993f.setVisibility(8);
        } else {
            eVar.f415992e.setVisibility(8);
            eVar.f415993f.setVisibility(0);
            eVar.f415993f.setOnClickListener(new t61.c(this, eVar));
        }
        view.setTag(eVar);
        return view;
    }
}
