package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class jb extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final int f207784d;

    /* renamed from: e, reason: collision with root package name */
    public final int f207785e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.res.ColorStateList[] f207786f;

    /* renamed from: g, reason: collision with root package name */
    public final float f207787g;

    /* renamed from: h, reason: collision with root package name */
    public final float f207788h;

    /* renamed from: i, reason: collision with root package name */
    public final float f207789i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f207790m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI f207791n;

    public jb(com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI settingCheckUnProcessWalletConvUI) {
        this.f207791n = settingCheckUnProcessWalletConvUI;
        android.content.res.ColorStateList[] colorStateListArr = new android.content.res.ColorStateList[5];
        this.f207786f = colorStateListArr;
        this.f207787g = -1.0f;
        this.f207788h = -1.0f;
        this.f207789i = -1.0f;
        colorStateListArr[0] = i65.a.e(settingCheckUnProcessWalletConvUI, com.tencent.mm.R.color.f479232tk);
        colorStateListArr[1] = i65.a.e(settingCheckUnProcessWalletConvUI, com.tencent.mm.R.color.f479417yo);
        colorStateListArr[3] = i65.a.e(settingCheckUnProcessWalletConvUI, com.tencent.mm.R.color.a0c);
        colorStateListArr[2] = i65.a.e(settingCheckUnProcessWalletConvUI, com.tencent.mm.R.color.f479415ym);
        colorStateListArr[2] = i65.a.e(settingCheckUnProcessWalletConvUI, com.tencent.mm.R.color.f479415ym);
        colorStateListArr[4] = i65.a.e(settingCheckUnProcessWalletConvUI, com.tencent.mm.R.color.f479305vl);
        if (i65.a.D(settingCheckUnProcessWalletConvUI)) {
            this.f207785e = settingCheckUnProcessWalletConvUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479616ar);
            this.f207784d = settingCheckUnProcessWalletConvUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479618at);
        } else {
            this.f207785e = settingCheckUnProcessWalletConvUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479615aq);
            this.f207784d = settingCheckUnProcessWalletConvUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479619au);
        }
        this.f207787g = i65.a.h(settingCheckUnProcessWalletConvUI, com.tencent.mm.R.dimen.f479897ia);
        this.f207788h = i65.a.h(settingCheckUnProcessWalletConvUI, com.tencent.mm.R.dimen.f479853h2);
        this.f207789i = i65.a.h(settingCheckUnProcessWalletConvUI, com.tencent.mm.R.dimen.f479930ja);
        this.f207790m = new java.util.HashMap();
    }

    public final java.lang.String a(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(str);
    }

    public final java.lang.CharSequence c(com.tencent.mm.storage.l4 l4Var) {
        int a17 = l4Var.a1();
        com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI settingCheckUnProcessWalletConvUI = this.f207791n;
        return a17 == 1 ? settingCheckUnProcessWalletConvUI.getString(com.tencent.mm.R.string.gqx) : l4Var.w0() == com.tencent.wcdb.core.Database.DictDefaultMatchValue ? "" : k35.m1.f(settingCheckUnProcessWalletConvUI, l4Var.w0(), true, false);
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.storage.l4 getItem(int i17) {
        return ((com.tencent.mm.storage.m4) c01.d9.b().r()).p((java.lang.String) this.f207791n.f207424e.get(i17));
    }

    public final int f(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return 1;
        }
        try {
            return java.lang.Integer.valueOf(str).intValue();
        } catch (java.lang.NumberFormatException unused) {
            return 1;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f207791n.f207424e.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04fb  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            Method dump skipped, instructions count: 1594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.jb.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
