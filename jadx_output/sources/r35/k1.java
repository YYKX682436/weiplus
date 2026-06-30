package r35;

@j95.b
/* loaded from: classes9.dex */
public class k1 extends i95.w implements o25.q1 {
    public void Ai(com.tencent.mm.ui.ga gaVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.ui.widget.dialog.j jVar) {
        r35.i1 i1Var = new r35.i1(gaVar.x());
        i1Var.l(str);
        com.tencent.mm.ui.widget.dialog.a aVar = i1Var.f369135b.f211821b;
        aVar.A = true;
        aVar.B = true;
        i1Var.i(str2);
        i1Var.g(java.lang.Boolean.FALSE);
        i1Var.f369137d = str3;
        i1Var.a(jVar);
        i1Var.k();
    }

    public void Bi(android.content.Context context, final java.lang.String str, byte[] bArr, com.tencent.mm.ui.widget.dialog.j jVar, int i17, final long j17, byte[] bArr2, final o25.p1 p1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.ConfirmDialogSerirvce", "showEmojiTransmitDialogForTagSearch");
        r45.lw5 lw5Var = new r45.lw5();
        try {
            lw5Var.parseFrom(bArr);
        } catch (java.lang.Exception unused) {
        }
        ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
        java.lang.String p17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(n22.m.g(), "", lw5Var.f379889d);
        if (bArr2 != null) {
            com.tencent.mm.vfs.w6.S(p17, bArr2, 0, bArr2.length);
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(lw5Var.f379889d);
        if (u17 == null) {
            u17 = new com.tencent.mm.storage.emotion.EmojiInfo();
            u17.field_md5 = lw5Var.f379889d;
            u17.field_catalog = 65;
            u17.field_type = com.tencent.mm.sdk.platformtools.y1.c(p17) ? 2 : 1;
            u17.field_groupId = lw5Var.f379891f;
            u17.field_size = (int) com.tencent.mm.vfs.w6.k(p17);
            u17.field_temp = 1;
            u17.field_activityid = lw5Var.f379894i;
            u17.field_designerID = lw5Var.f379893h;
            u17.field_thumbUrl = lw5Var.f379892g;
            if (com.tencent.mm.sdk.platformtools.t8.K0(lw5Var.f379901s)) {
                u17.field_cdnUrl = lw5Var.f379900r;
            } else {
                u17.field_encrypturl = lw5Var.f379900r;
                u17.field_aeskey = lw5Var.f379901s;
            }
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().c().J0(u17);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(u17.field_groupId) && !com.tencent.mm.sdk.platformtools.t8.K0(lw5Var.f379891f)) {
            u17.field_groupId = lw5Var.f379891f;
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().c().G2(u17);
        }
        if (i17 == 0) {
            u17.K2 = qk.z6.SEND_FROM_SCENE_LONG_PRESS_SEARCH;
        } else {
            u17.K2 = qk.z6.SEND_FROM_SCENE_SEARCH;
        }
        if (bArr2 == null) {
            final com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = u17;
            zq.h.f474972a.e(u17, new dr.q() { // from class: r35.k1$$a
                @Override // dr.q
                public final void a(boolean z17) {
                    final com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = emojiInfo;
                    final java.lang.String str2 = str;
                    final long j18 = j17;
                    final o25.p1 p1Var2 = o25.p1.this;
                    if (p1Var2 != null) {
                        new qr.x(emojiInfo2, new qr.i() { // from class: r35.k1$$b
                            @Override // qr.i
                            public final void onResult(int i18, java.lang.String str3) {
                                o25.p1.this.a(str2, emojiInfo2, i18 == 0, j18);
                            }
                        });
                    } else if (z17) {
                        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().Y(str2, emojiInfo2, null, null, emojiInfo2.K2.ordinal());
                    }
                }
            });
        } else if (p1Var != null) {
            p1Var.a(str, u17, true, j17);
        } else {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().Y(str, u17, null, null, u17.K2.ordinal());
        }
    }

    public void Di(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.ui.widget.dialog.j jVar) {
        r35.i1 i1Var = new r35.i1(context);
        i1Var.l(str);
        i1Var.i(str2);
        i1Var.g(java.lang.Boolean.TRUE);
        i1Var.f369135b.f211821b.Q = 2;
        i1Var.f369137d = str3;
        i1Var.a(jVar);
        i1Var.k();
    }

    public com.tencent.mm.ui.widget.dialog.j0 Ni(android.content.Context context, java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2, int i17, com.tencent.mm.ui.widget.dialog.j jVar) {
        r35.i1 i1Var = new r35.i1(context);
        i1Var.d(bitmap, i17);
        i1Var.l(str);
        i1Var.g(java.lang.Boolean.TRUE);
        i1Var.h(false);
        i1Var.f369137d = str2;
        i1Var.a(jVar);
        return i1Var.f369136c;
    }

    public void Ri(android.content.Context context, java.lang.String str, java.lang.String str2, com.tencent.mm.ui.widget.dialog.j jVar, com.tencent.mm.ui.widget.dialog.i iVar, android.content.DialogInterface.OnDismissListener onDismissListener) {
        r35.i1 i1Var = new r35.i1(context);
        i1Var.l(str);
        i1Var.g(java.lang.Boolean.TRUE);
        i1Var.h(false);
        i1Var.i(str2);
        com.tencent.mm.ui.widget.dialog.a aVar = i1Var.f369135b.f211821b;
        aVar.A = false;
        aVar.B = false;
        i1Var.f369138e = onDismissListener;
        i1Var.b(iVar);
        i1Var.j(com.tencent.mm.R.string.f490551ya);
        i1Var.a(new r35.l1(this, jVar));
        i1Var.k();
    }

    public db5.d5 wi(com.tencent.mm.ui.ga gaVar, android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.mm.ui.widget.dialog.j jVar) {
        android.widget.ImageView imageView;
        android.view.View inflate = ((android.view.LayoutInflater) gaVar.x().getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.f488676a06, (android.view.ViewGroup) null);
        db5.d5 d5Var = new db5.d5(inflate, -1, -1);
        r35.j1.c(inflate, jVar, d5Var);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem8 fail,title or  message is empty");
            return null;
        }
        r35.j1.f(inflate, com.tencent.mm.R.id.c_o, str2, false, 0);
        com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = (com.tencent.mm.ui.base.NoMeasuredTextView) inflate.findViewById(com.tencent.mm.R.id.c_k);
        noMeasuredTextView.setShouldEllipsize(true);
        noMeasuredTextView.i(0, gaVar.x().getResources().getDimension(com.tencent.mm.R.dimen.f479568k) * i65.a.q(gaVar.x()));
        noMeasuredTextView.setTextColor(i65.a.e(gaVar.x(), com.tencent.mm.R.color.a0c));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            k12.r rVar = (k12.r) i95.n0.c(k12.r.class);
            androidx.appcompat.app.AppCompatActivity x17 = gaVar.x();
            ((h12.b) rVar).getClass();
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            noMeasuredTextView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(x17, str3));
        } else {
            k12.r rVar2 = (k12.r) i95.n0.c(k12.r.class);
            androidx.appcompat.app.AppCompatActivity x18 = gaVar.x();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            ((h12.b) rVar2).getClass();
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            noMeasuredTextView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(x18, e17));
        }
        r35.j1.f(inflate, com.tencent.mm.R.id.c_g, str4, true, 8);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.c_6);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            button.setText(str5);
        }
        button.setOnClickListener(new r35.f1(jVar, inflate, d5Var));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.c_m), str, null);
        } else if (bitmap != null && (imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.c_m)) != null) {
            if (bitmap.isRecycled()) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageBitmap(bitmap);
                d5Var.setOnDismissListener(new r35.v0(bitmap));
            }
        }
        r35.j1.h(gaVar, d5Var);
        return d5Var;
    }
}
