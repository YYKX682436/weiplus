package h65;

/* loaded from: classes12.dex */
public class c implements s25.b {

    /* renamed from: b, reason: collision with root package name */
    public static final h65.b f279320b;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f279321a;

    static {
        new h65.a();
        f279320b = new h65.b();
    }

    public static android.os.Bundle B(android.net.Uri uri, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        try {
            bundle2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().call(uri, str, str2, bundle);
        } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException | java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmotionStorageResolver", e17, "", new java.lang.Object[0]);
            bundle2 = null;
        }
        return bundle2 != null ? bundle2 : new android.os.Bundle();
    }

    public static android.net.Uri C() {
        return android.net.Uri.parse("content://" + qk.d0.f364065a + "/");
    }

    @Override // s25.b
    public java.lang.String A() {
        if (((km0.c) gm0.j1.p().a()).a()) {
            return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).A();
        }
        android.os.Bundle B = B(C(), "getPanelConfigName", null, null);
        B.setClassLoader(com.tencent.mm.storage.emotion.SmileyPanelConfigInfo.class.getClassLoader());
        return B.getString("key_data");
    }

    @Override // s25.b
    public void a() {
        if (((km0.c) gm0.j1.p().a()).a()) {
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).a();
        }
    }

    @Override // s25.b
    public void b(l75.q0 q0Var) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).b(q0Var);
        }
    }

    @Override // s25.b
    public void c(java.lang.String str) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            if (gm0.j1.b().m()) {
                ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).c(str);
            }
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_md5", str);
            com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().call(C(), "addCaptureEmojiUploadTask", (java.lang.String) null, bundle);
        }
    }

    @Override // s25.b
    public com.tencent.mm.storage.emotion.EmojiInfo d(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).d(emojiInfo);
        }
        android.os.Bundle bundle = new android.os.Bundle(com.tencent.mm.storage.emotion.EmojiInfo.class.getClassLoader());
        bundle.putParcelable("emoji", emojiInfo);
        android.os.Bundle call = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().call(C(), "getRandomEmoji", (java.lang.String) null, bundle);
        if (call == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmotionStorageResolver", "[getRandomEmoji] bunndle is null! ");
            return null;
        }
        call.setClassLoader(com.tencent.mm.storage.emotion.EmojiInfo.class.getClassLoader());
        if (call.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)) {
            return (com.tencent.mm.storage.emotion.EmojiInfo) call.getParcelable(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.EmotionStorageResolver", "[getRandomEmoji] bundle is null?", false);
        return null;
    }

    @Override // s25.b
    public boolean e() {
        if (!((km0.c) gm0.j1.p().a()).a()) {
            return B(C(), "isEnableHEVCDecode", null, null).getBoolean("key_data");
        }
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        return gr.z.b();
    }

    @Override // s25.b
    public void f(l75.q0 q0Var) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).f(q0Var);
        }
    }

    @Override // s25.b
    public void g(java.lang.String str) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).g(str);
        }
    }

    @Override // s25.b
    public boolean h() {
        if (!((km0.c) gm0.j1.p().a()).a()) {
            return B(C(), "isEnableHevcUpload", null, null).getBoolean("key_data");
        }
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        return gr.z.c();
    }

    @Override // s25.b
    public void i(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            if (gm0.j1.b().m()) {
                ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).i(emojiInfo);
            }
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("emojiInfo", emojiInfo);
            com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().call(C(), "showCaptureEmojiInPanel", (java.lang.String) null, bundle);
        }
    }

    @Override // s25.b
    public java.util.List j() {
        if (((km0.c) gm0.j1.p().a()).a()) {
            return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).j();
        }
        return null;
    }

    @Override // s25.b
    public com.tencent.mm.storage.emotion.EmojiIPSetInfo k(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).k(str);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_ip_key", str);
        android.os.Bundle B = B(C(), "getIpSetInfo", null, bundle);
        B.setClassLoader(com.tencent.mm.storage.emotion.EmojiIPSetInfo.class.getClassLoader());
        return (com.tencent.mm.storage.emotion.EmojiIPSetInfo) B.getParcelable("key_data");
    }

    @Override // s25.b
    public java.lang.Object l(com.tencent.mm.storage.u3 u3Var, java.lang.Object obj) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).l(u3Var, obj);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putSerializable("key_config_key", u3Var);
        java.lang.Object obj2 = B(C(), "getConfig", null, bundle).get("key_config_value");
        return obj2 != null ? obj2 : obj;
    }

    @Override // s25.b
    public void m(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m(emojiInfo);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.setClassLoader(com.tencent.mm.storage.emotion.EmojiInfo.class.getClassLoader());
        bundle.putParcelable("key_emoji_info", emojiInfo);
        B(C(), "updateEmojiInfo", null, bundle);
    }

    @Override // s25.b
    public boolean n(java.lang.String str) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).n(str);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_path", str);
        return B(C(), "checkGifFile", null, bundle).getBoolean("key_data");
    }

    @Override // s25.b
    public com.tencent.mm.storage.emotion.EmojiInfo o(java.lang.String str, int i17, int i18, int i19) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).D(str, "", i17, i18, i19, null, null, null, "");
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_md5", str);
        bundle.putInt("key_group", i17);
        bundle.putInt("key_type", i18);
        bundle.putInt("key_size", i19);
        android.os.Bundle B = B(C(), "createEmojiInfo", null, bundle);
        B.setClassLoader(com.tencent.mm.storage.emotion.EmojiInfo.class.getClassLoader());
        return (com.tencent.mm.storage.emotion.EmojiInfo) B.getParcelable("key_emoji_info");
    }

    @Override // s25.b
    public void onDestroy() {
    }

    @Override // s25.b
    public boolean p() {
        if (((km0.c) gm0.j1.p().a()).a()) {
            return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).p();
        }
        return false;
    }

    @Override // s25.b
    public void q(l75.q0 q0Var) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).q(q0Var);
        }
    }

    @Override // s25.b
    public boolean r(android.content.Context context, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, int i17, int i18, boolean z17, boolean z18, java.lang.String str, java.util.ArrayList arrayList, java.lang.String str2) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmotionStorageResolver", "[cpan] save emoji failed. context is null");
            return false;
        }
        if (emojiInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmotionStorageResolver", "[cpan] save emoji failed. emoji is null");
            return false;
        }
        try {
            android.content.Intent intent = new android.content.Intent();
            int i19 = com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.L;
            intent.setClass(context, com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.class);
            intent.putExtra("extra_id", emojiInfo.getMd5());
            intent.putExtra("extra_scence", i17);
            intent.putExtra("extra_move_to_top", z17);
            intent.putExtra("extra_current", true);
            intent.putExtra("key_is_selfie", z18);
            intent.putExtra("key_attached_text", str);
            intent.putExtra("key_attached_emoji_md5", arrayList);
            intent.putExtra("key_imitate_md5", str2);
            intent.addFlags(65536);
            if (i18 <= 0 || !(context instanceof android.app.Activity)) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/resolver/EmotionStorageResolver", "saveCustomEmoji", "(Landroid/content/Context;Lcom/tencent/mm/storage/emotion/EmojiInfo;IIZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/resolver/EmotionStorageResolver", "saveCustomEmoji", "(Landroid/content/Context;Lcom/tencent/mm/storage/emotion/EmojiInfo;IIZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList3.add(java.lang.Integer.valueOf(i18));
                arrayList3.add(intent);
                java.util.Collections.reverse(arrayList3);
                yj0.a.k((android.app.Activity) context, arrayList3.toArray(), "com/tencent/mm/resolver/EmotionStorageResolver", "saveCustomEmoji", "(Landroid/content/Context;Lcom/tencent/mm/storage/emotion/EmojiInfo;IIZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmotionStorageResolver", e17, "start EmojiAddCustomDialogUI failed", new java.lang.Object[0]);
        }
        return true;
    }

    @Override // s25.b
    public boolean s(java.lang.String str) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).s(str);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_path", str);
        return B(C(), "checkGifFile", null, bundle).getBoolean("key_data");
    }

    @Override // s25.b
    public void t(l75.q0 q0Var) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).t(q0Var);
        }
    }

    @Override // s25.b
    public void u(com.tencent.mm.storage.u3 u3Var, java.lang.Object obj) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).u(u3Var, obj);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putSerializable("key_config_key", u3Var);
        bundle.putSerializable("key_config_value", (java.io.Serializable) obj);
        B(C(), "setConfig", null, bundle);
    }

    @Override // s25.b
    public java.lang.String v(java.lang.String str) {
        return ((km0.c) gm0.j1.p().a()).a() ? ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(str) : B(C(), "getCurLangDesc", str, null).getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "");
    }

    @Override // s25.b
    public java.lang.String w() {
        if (((km0.c) gm0.j1.p().a()).a()) {
            this.f279321a = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).w();
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f279321a)) {
            this.f279321a = B(C(), "getAccPath", null, null).getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        }
        return this.f279321a;
    }

    @Override // s25.b
    public boolean x() {
        if (((km0.c) gm0.j1.p().a()).a()) {
            return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).x();
        }
        return false;
    }

    @Override // s25.b
    public com.tencent.mm.storage.emotion.EmojiInfo y(java.lang.String str) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(str);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_md5", str);
        android.os.Bundle B = B(C(), "getEmojiByMd5", null, bundle);
        B.setClassLoader(com.tencent.mm.storage.emotion.EmojiInfo.class.getClassLoader());
        return (com.tencent.mm.storage.emotion.EmojiInfo) B.getParcelable("key_emoji_info");
    }

    @Override // s25.b
    public byte[] z(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        return ((km0.c) gm0.j1.p().a()).a() ? ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).z(emojiInfo) : wq.a.f().c(emojiInfo);
    }
}
