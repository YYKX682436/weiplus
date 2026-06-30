package hr3;

/* loaded from: classes11.dex */
public class z9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.ja f284238d;

    public z9(hr3.ja jaVar) {
        this.f284238d = jaVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String string;
        int itemId = menuItem.getItemId();
        r61.a aVar = null;
        hr3.ja jaVar = this.f284238d;
        switch (itemId) {
            case 1:
                jaVar.f283696d.f284109e.M1.d("hide_btn");
                hr3.va vaVar = jaVar.f283696d;
                vaVar.f284109e.M1.c();
                vaVar.getClass();
                com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
                com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = vaVar.f284109e;
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) q17).n(normalUserFooterPreference.L.d1(), true);
                normalUserFooterPreference.L = n17;
                if (!n17.r2()) {
                    vaVar.a(normalUserFooterPreference.L.d1());
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_Scene", normalUserFooterPreference.N);
                intent.putExtra("Contact_User", normalUserFooterPreference.L.d1());
                com.tencent.mm.ui.MMActivity mMActivity = normalUserFooterPreference.K1;
                intent.putExtra("Contact_RoomNickname", mMActivity.getIntent().getStringExtra("Contact_RoomNickname"));
                intent.putExtra("contact_phone_number_list", normalUserFooterPreference.L.E1);
                java.lang.String str = "";
                if (!normalUserFooterPreference.L.p2()) {
                    java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Contact_Mobile_MD5");
                    java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("Contact_full_Mobile_MD5");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(normalUserFooterPreference.L.d1())) {
                            aVar = m61.k.wi().h(normalUserFooterPreference.L.d1());
                        }
                    } else if ((!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) && ((aVar = m61.k.wi().i(stringExtra)) == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.e()))) {
                        aVar = m61.k.wi().i(stringExtra2);
                    }
                    if (aVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.e())) {
                        java.lang.String f17 = aVar.f();
                        if (f17 == null) {
                            f17 = "";
                        }
                        str = f17.replace(" ", "");
                    }
                }
                intent.putExtra("contact_phone_number_by_md5", str);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.m(intent, normalUserFooterPreference.f197770d);
                return;
            case 2:
                boolean t27 = jaVar.f283696d.f284109e.L.t2();
                hr3.va vaVar2 = jaVar.f283696d;
                if (t27) {
                    c01.e2.y0(vaVar2.f284109e.L);
                    com.tencent.mm.ui.MMActivity mMActivity2 = vaVar2.f284109e.K1;
                    db5.e1.T(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.f491007bj5));
                } else {
                    c01.e2.o0(vaVar2.f284109e.L);
                    com.tencent.mm.ui.MMActivity mMActivity3 = vaVar2.f284109e.K1;
                    db5.e1.T(mMActivity3, mMActivity3.getString(com.tencent.mm.R.string.bdk));
                }
                vaVar2.f284109e.L = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(vaVar2.f284109e.L.d1(), true);
                return;
            case 3:
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("sns_permission_userName", jaVar.f283696d.f284109e.L.d1());
                intent2.putExtra("sns_permission_anim", true);
                intent2.putExtra("sns_permission_block_scene", 1);
                j45.l.j(jaVar.f283696d.f284109e.K1, "sns", ".ui.SnsPermissionUI", intent2, null);
                return;
            case 4:
                com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference2 = jaVar.f283696d.f284109e;
                java.lang.String d17 = normalUserFooterPreference2.L.d1();
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("Select_Talker_Name", normalUserFooterPreference2.L.d1());
                intent3.putExtra("Select_block_List", d17);
                intent3.putExtra("Select_Conv_Type", 3);
                intent3.putExtra("Select_Send_Card", true);
                intent3.putExtra("mutil_select_is_ret", true);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.getClass();
                com.tencent.mm.ui.MMActivity mMActivity4 = normalUserFooterPreference2.K1;
                intent3.setClass(mMActivity4, com.tencent.mm.ui.transmit.SelectConversationUI.class);
                mMActivity4.startActivityForResult(intent3, 1);
                return;
            case 5:
                boolean o27 = jaVar.f283696d.f284109e.L.o2();
                hr3.va vaVar3 = jaVar.f283696d;
                if (o27) {
                    com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference3 = vaVar3.f284109e;
                    c01.e2.F0(normalUserFooterPreference3.L);
                    normalUserFooterPreference3.L.r3();
                    if (normalUserFooterPreference3.X) {
                        normalUserFooterPreference3.H1.setVisibility(8);
                        vaVar3.f();
                        return;
                    }
                    return;
                }
                android.view.View inflate = android.view.View.inflate(vaVar3.f284109e.f197770d, com.tencent.mm.R.layout.bxs, null);
                inflate.setPadding(0, 0, 0, 0);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jlf);
                textView.setPadding(0, 0, 0, 0);
                textView.setText(com.tencent.mm.storage.z3.m4(vaVar3.f284109e.L.d1()) ? com.tencent.mm.R.string.bfe : com.tencent.mm.R.string.bfd);
                android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.jld);
                checkBox.setChecked(false);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jle);
                textView2.setText(com.tencent.mm.R.string.bff);
                if (vaVar3.f284109e.L.getSource() == 18) {
                    checkBox.setVisibility(0);
                    textView2.setVisibility(0);
                } else {
                    checkBox.setVisibility(8);
                    textView2.setVisibility(8);
                }
                android.content.Context context = vaVar3.f284109e.f197770d;
                db5.e1.I(context, true, context.getString(com.tencent.mm.R.string.bfc), inflate, vaVar3.f284109e.f197770d.getString(com.tencent.mm.R.string.f490507x1), vaVar3.f284109e.f197770d.getString(com.tencent.mm.R.string.f490347sg), new hr3.x9(this, checkBox), null);
                return;
            case 6:
                android.view.View inflate2 = android.view.View.inflate(jaVar.f283696d.f284109e.f197770d, com.tencent.mm.R.layout.bxs, null);
                inflate2.setPadding(0, 0, 0, 0);
                android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.jlf);
                textView3.setPadding(0, 0, 0, 0);
                hr3.va vaVar4 = jaVar.f283696d;
                if (c01.e2.M(vaVar4.f284109e.L.d1())) {
                    com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference4 = vaVar4.f284109e;
                    string = normalUserFooterPreference4.f197770d.getString(com.tencent.mm.R.string.f491042bo4, normalUserFooterPreference4.L.g2());
                } else {
                    com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference5 = vaVar4.f284109e;
                    string = normalUserFooterPreference5.f197770d.getString(com.tencent.mm.R.string.f491039bo1, normalUserFooterPreference5.L.g2());
                }
                textView3.setText(string);
                android.widget.CheckBox checkBox2 = (android.widget.CheckBox) inflate2.findViewById(com.tencent.mm.R.id.jld);
                checkBox2.setChecked(false);
                android.widget.TextView textView4 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.jle);
                textView4.setText(com.tencent.mm.R.string.bff);
                if (vaVar4.f284109e.L.getSource() == 18) {
                    checkBox2.setVisibility(0);
                    textView4.setVisibility(0);
                } else {
                    checkBox2.setVisibility(8);
                    textView4.setVisibility(8);
                }
                android.content.Context context2 = vaVar4.f284109e.f197770d;
                db5.e1.J(context2, true, context2.getString(com.tencent.mm.R.string.f490961bd5), inflate2, vaVar4.f284109e.f197770d.getString(com.tencent.mm.R.string.f490367t0), vaVar4.f284109e.f197770d.getString(com.tencent.mm.R.string.f490347sg), new hr3.y9(this, checkBox2), null, com.tencent.mm.R.color.f478622ch);
                return;
            case 7:
                hr3.va vaVar5 = jaVar.f283696d;
                com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference6 = vaVar5.f284109e;
                normalUserFooterPreference6.L.getClass();
                xp1.c.j(normalUserFooterPreference6.K1, normalUserFooterPreference6.L.d1());
                com.tencent.mm.sdk.platformtools.u3.i(new hr3.ka(vaVar5), 1000L);
                return;
            case 8:
            default:
                return;
            case 9:
                hr3.va.b(jaVar.f283696d);
                return;
        }
    }
}
