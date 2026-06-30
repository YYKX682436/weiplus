package qa4;

/* loaded from: classes4.dex */
public final class k implements n85.g {

    /* renamed from: a, reason: collision with root package name */
    public static final qa4.k f361095a = new qa4.k();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f361096b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f361097c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f361098d = "";

    @Override // n85.g
    public void a(android.content.Context context, java.lang.String snsId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showDetailUI", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(snsId);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("WithTaComposeOp", "showDetailUI snsInfo is null :snsId:%s", snsId);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDetailUI", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
            return;
        }
        com.tencent.mars.xlog.Log.i("WithTaComposeOp", "showDetailUI snsId:%s localId:%d", snsId, java.lang.Integer.valueOf(b17.localid));
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.class);
        intent.putExtra("INTENT_TALKER", f361098d);
        intent.putExtra("INTENT_NEED_RPT_FEED", true);
        intent.putExtra("INTENT_SNS_LOCAL_ID", com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", b17.localid));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/model/withta/WithTaComposeOp", "showDetailUI", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/model/withta/WithTaComposeOp", "showDetailUI", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDetailUI", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
    }

    @Override // n85.g
    public java.lang.String b(int i17, r45.jj4 media) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        kotlin.jvm.internal.o.g(media, "media");
        java.lang.String i18 = com.tencent.mm.plugin.sns.model.y6.i("sns_table_" + i17, media);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return i18;
    }

    @Override // n85.g
    public boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSelf", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        boolean equals = com.tencent.mm.plugin.sns.model.l4.sj().equals(f361098d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSelf", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return equals;
    }

    @Override // n85.g
    public void d(android.content.Context context, kotlinx.coroutines.y0 scope, java.lang.String seq, int i17, int i18, yz5.l cb6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAlertListDialog", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(seq, "seq");
        kotlin.jvm.internal.o.g(cb6, "cb");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAlertListDialog", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String string = context.getString(com.tencent.mm.R.string.jhw);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        linkedList.add(new jz5.l(1, string));
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.f211872n = new qa4.l(linkedList);
        k0Var.r(context.getString(i18), 17, i65.a.b(context, 12), null);
        k0Var.f211881s = new qa4.n(scope, seq, i17, cb6);
        k0Var.v();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAlertListDialog", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAlertListDialog", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
    }

    @Override // n85.g
    public void e(android.content.Context context, int i17, boolean z17, n85.e data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("imagePreview", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsGalleryUI.class);
        intent.putExtra("sns_gallery_userName", f361098d);
        intent.putExtra("sns_gallery_is_self", z17);
        intent.putExtra("sns_gallery_localId", i17);
        intent.putExtra("key_from_scene", 4);
        intent.putExtra("sns_gallery_position", data.f335705b);
        com.tencent.mm.plugin.sns.model.l4.Kj().s(f361098d, data.f335704a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/model/withta/WithTaComposeOp", "imagePreview", "(Landroid/content/Context;IZLcom/tencent/mm/sns_compose/api/GalleryData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/model/withta/WithTaComposeOp", "imagePreview", "(Landroid/content/Context;IZLcom/tencent/mm/sns_compose/api/GalleryData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("imagePreview", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
    }

    @Override // n85.g
    public java.lang.Object f(r45.jj4 jj4Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsMediaBitmap", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageFromMedia", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new qa4.a(jj4Var, z17, null), continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageFromMedia", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMediaBitmap", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return g17;
    }

    @Override // n85.g
    public java.lang.String g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWithFriends", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        java.lang.String str = f361097c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithFriends", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return str;
    }

    @Override // n85.g
    public java.lang.String getDisplayName(java.lang.String userName) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        kotlin.jvm.internal.o.g(userName, "userName");
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String a17 = c01.a2.a(userName);
        kotlin.jvm.internal.o.f(a17, "getDisplayRemark(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return a17;
    }

    @Override // n85.g
    public java.lang.String getUsername() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUsername", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        java.lang.String str = f361098d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUsername", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return str;
    }

    @Override // n85.g
    public java.lang.Object h(java.lang.String str, java.lang.String str2, boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImagePath", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImagePath", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new qa4.b(str, str2, z17, null), continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImagePath", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImagePath", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return g17;
    }

    @Override // n85.g
    public java.lang.String i(android.content.Context context, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayTime", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        kotlin.jvm.internal.o.g(context, "context");
        long j17 = i17 * 1000;
        java.util.Map map = com.tencent.mm.plugin.sns.ui.os.f170121a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fromatSnsWithTa", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTimeInMillis(j17);
        boolean z17 = calendar.get(1) == calendar2.get(1);
        boolean z18 = z17 && calendar.get(2) == calendar2.get(2);
        boolean z19 = z17 && z18 && calendar.get(5) == calendar2.get(5);
        boolean z27 = z17 && z18 && calendar.get(5) - 1 == calendar2.get(5);
        if (!z27) {
            if ((z17 && calendar.get(2) - 1 == calendar2.get(2)) || calendar.get(1) - calendar2.get(1) == 1) {
                calendar.add(5, -1);
                z27 = calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
            }
        }
        if (z19) {
            str = context.getString(com.tencent.mm.R.string.fd_);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromatSnsWithTa", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        } else if (z27) {
            str = context.getString(com.tencent.mm.R.string.fdi);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromatSnsWithTa", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        } else {
            java.lang.String str2 = z17 ? (java.lang.String) android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.f492135fc2), j17) : (java.lang.String) android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.fcl), j17);
            if (str2.indexOf("-") > 0) {
                int i18 = calendar2.get(2) + 1;
                str2 = calendar2.get(5) + " " + com.tencent.mm.plugin.sns.ui.os.e(context, i18);
                if (!z17) {
                    str2 = str2 + " " + calendar2.get(1);
                }
            }
            str = str2 + " " + ((java.lang.String) com.tencent.mm.plugin.sns.ui.os.c(context, j17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromatSnsWithTa", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        }
        if (str == null) {
            str = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayTime", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return str;
    }

    @Override // n85.g
    public void j(android.content.Context context, java.lang.String username, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startProfile", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", username);
        intent.putExtra("Contact_Scene", i17);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", i18);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startProfile", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
    }

    @Override // n85.g
    public java.lang.Object k(long j17, int i17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPage", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        java.lang.Object a17 = qa4.h.f361091a.a(j17, i17, f361098d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPage", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return a17;
    }

    @Override // n85.g
    public java.lang.String l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        java.lang.String sj6 = com.tencent.mm.plugin.sns.model.l4.sj();
        kotlin.jvm.internal.o.f(sj6, "getSelfName(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return sj6;
    }

    @Override // n85.g
    public long m(java.lang.String snsId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        long n17 = com.tencent.mm.plugin.sns.storage.w2.n(snsId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return n17;
    }

    @Override // n85.g
    public fk4.p n(int i17, r45.jj4 media, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoTask", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        kotlin.jvm.internal.o.g(media, "media");
        xd4.i0 i0Var = new xd4.i0(media, i18, "sns_table_" + i17, new ok4.c(java.lang.System.currentTimeMillis()), new qa4.i());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoTask", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return i0Var;
    }

    @Override // n85.g
    public java.lang.Object o(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatarBitmap", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarBitmap", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return a17;
    }

    @Override // n85.g
    public boolean p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTogetherVideoEnabled", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTogetherVideoEnabled", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_together_video_enabled, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTogetherVideoEnabled", "com.tencent.mm.plugin.sns.model.SnsConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTogetherVideoEnabled", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return fj6;
    }

    @Override // n85.g
    public java.lang.String q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRemark", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = f361098d;
        ((sg3.a) v0Var).getClass();
        java.lang.String a17 = c01.a2.a(str);
        kotlin.jvm.internal.o.f(a17, "getDisplayRemark(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRemark", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return a17;
    }

    @Override // n85.g
    public int r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ownerSetting", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        int i17 = 0;
        if (p94.w0.c() != null) {
            r45.cb6 b17 = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(f361098d);
            if (b17 != null) {
                int i18 = b17.f371431g;
                int i19 = b17.f371432h;
                if (i19 == 4320 && (i18 & 4096) > 0) {
                    i17 = 1;
                } else if (i19 == 72 && (i18 & 4096) > 0) {
                    i17 = 2;
                } else if (i19 == 720 && (i18 & 4096) > 0) {
                    i17 = 3;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ownerSetting", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
                return i17;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ownerSetting", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return 0;
    }

    public final java.util.ArrayList s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWithFriendsNameList", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        java.util.ArrayList arrayList = f361096b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithFriendsNameList", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(java.lang.String r9, int r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            java.lang.String r0 = "snsWithTaOpRequest"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r11 instanceof qa4.j
            if (r2 == 0) goto L1b
            r2 = r11
            qa4.j r2 = (qa4.j) r2
            int r3 = r2.f361094f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f361094f = r3
            goto L20
        L1b:
            qa4.j r2 = new qa4.j
            r2.<init>(r8, r11)
        L20:
            java.lang.Object r11 = r2.f361092d
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f361094f
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L2f
            kotlin.ResultKt.throwOnFailure(r11)
            goto L76
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L3a:
            kotlin.ResultKt.throwOnFailure(r11)
            com.tencent.mm.modelbase.l r11 = new com.tencent.mm.modelbase.l
            r11.<init>()
            r4 = 5213(0x145d, float:7.305E-42)
            r11.f70667d = r4
            java.lang.String r4 = "/cgi-bin/micromsg-bin/mmsnswithtaop"
            r11.f70666c = r4
            r45.kb6 r4 = new r45.kb6
            r4.<init>()
            long r6 = ca4.z0.F0(r9)
            r4.f378578d = r6
            r4.f378579e = r10
            r11.f70664a = r4
            r45.lb6 r9 = new r45.lb6
            r9.<init>()
            r11.f70665b = r9
            com.tencent.mm.modelbase.o r9 = r11.a()
            o01.c r10 = o01.d.f341891a
            kotlinx.coroutines.flow.j r9 = r10.a(r9)
            r2.f361094f = r5
            java.lang.Object r11 = kotlinx.coroutines.flow.l.o(r9, r2)
            if (r11 != r3) goto L76
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L76:
            r9 = r11
            o01.a r9 = (o01.a) r9
            q01.f r9 = r9.f359284a
            q01.f r10 = q01.f.f359276e
            r2 = 0
            if (r9 != r10) goto L82
            r9 = r5
            goto L83
        L82:
            r9 = r2
        L83:
            if (r9 == 0) goto L86
            goto L87
        L86:
            r11 = 0
        L87:
            o01.a r11 = (o01.a) r11
            if (r11 == 0) goto L92
            r45.ny3 r9 = r11.f359289f
            r45.lb6 r9 = (r45.lb6) r9
            if (r9 == 0) goto L92
            goto L93
        L92:
            r5 = r2
        L93:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qa4.k.t(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
