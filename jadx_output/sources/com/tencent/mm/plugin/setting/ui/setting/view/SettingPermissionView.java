package com.tencent.mm.plugin.setting.ui.setting.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/view/SettingPermissionView;", "Landroid/widget/FrameLayout;", "", "f", "Ljava/lang/String;", "getPermission", "()Ljava/lang/String;", "setPermission", "(Ljava/lang/String;)V", "permission", "g", "getBusiness", "setBusiness", "business", "Lu60/e;", "r", "Lu60/e;", "getOnAddr", "()Lu60/e;", "setOnAddr", "(Lu60/e;)V", "onAddr", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class SettingPermissionView extends android.widget.FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.List f161655s = kz5.c0.i("chatting", "radar", "face2face_group", "sns", "finder", "live", "scan", "shake", "story", ya.a.SEARCH, "nearby", "game", "nearby_appbrand", "mine", "status", "fav", "card", "musicplayer", "net_check", "wifi_info", "pay", "biz", "webview", "contact", "emoji", "sport", "mail", "voiceprint", "add_contact", "contact_remark", "wechatout", "savefile", "appbrand", "ting", "red_packet", "wxShop");

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.List f161656t = kz5.c0.i(ya.b.LOCATION, "contact", "storage", "camera", "microphone", "bluetooth", "healthy", "overlay");

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f161657d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f161658e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public java.lang.String permission;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public java.lang.String business;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f161661h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f161662i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.o4 f161663m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f161664n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f161665o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f161666p;

    /* renamed from: q, reason: collision with root package name */
    public final i11.c f161667q;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public u60.e onAddr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingPermissionView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f161667q = new x14.t(this);
        this.onAddr = new x14.u(this);
        c(attrs, 0);
        b(context);
    }

    public final boolean a(java.lang.String str, java.lang.String str2) {
        return !((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).nj(str, str2);
    }

    public final void b(android.content.Context context) {
        java.lang.String string;
        this.f161658e = context;
        if (context == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.ckq, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f161657d = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.ktp);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f161661h = (android.widget.TextView) findViewById;
        android.view.View view = this.f161657d;
        if (view == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.kto);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f161662i = (android.widget.TextView) findViewById2;
        android.widget.TextView textView = this.f161661h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mItemNameTextView");
            throw null;
        }
        java.util.HashMap hashMap = e85.i.f250315a;
        textView.setText((java.lang.CharSequence) e85.i.f250318d.get(getBusiness()));
        android.widget.TextView textView2 = this.f161662i;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("mItemStatusTextView");
            throw null;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f161663m;
        if (o4Var == null) {
            kotlin.jvm.internal.o.o("mmkv");
            throw null;
        }
        if (o4Var.getBoolean(getBusiness(), a(getPermission(), getBusiness()))) {
            string = "";
        } else {
            android.content.Context context2 = this.f161658e;
            if (context2 == null) {
                kotlin.jvm.internal.o.o("mContext");
                throw null;
            }
            string = context2.getString(com.tencent.mm.R.string.ivr);
        }
        textView2.setText(string);
        android.view.View view2 = this.f161657d;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        view2.setBackgroundResource(com.tencent.mm.R.drawable.f482025au1);
        android.view.View view3 = this.f161657d;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        view3.setOnClickListener(new x14.s(this));
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = this.f161663m;
        if (o4Var2 != null) {
            this.f161666p = o4Var2.getBoolean(getBusiness(), a(getPermission(), getBusiness()));
        } else {
            kotlin.jvm.internal.o.o("mmkv");
            throw null;
        }
    }

    public final void c(android.util.AttributeSet attributeSet, int i17) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17 = false;
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f14.f.f258684a, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(obtainStyledAttributes.getInt(1, -1));
        int intValue = valueOf.intValue();
        java.util.List list = f161656t;
        if (!(1 <= intValue && intValue <= list.size())) {
            valueOf = null;
        }
        if (valueOf == null || (str = (java.lang.String) list.get(valueOf.intValue() - 1)) == null) {
            str = "unknown_permission";
        }
        setPermission(str);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(obtainStyledAttributes.getInt(0, -1));
        int intValue2 = valueOf2.intValue();
        java.util.List list2 = f161655s;
        if (1 <= intValue2 && intValue2 <= list2.size()) {
            z17 = true;
        }
        java.lang.Integer num = z17 ? valueOf2 : null;
        if (num == null || (str2 = (java.lang.String) list2.get(num.intValue() - 1)) == null) {
            str2 = "unknown_business";
        }
        setBusiness(str2);
        com.tencent.mm.sdk.platformtools.o4 Zi = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Zi(getPermission());
        kotlin.jvm.internal.o.f(Zi, "getPermissionConfigMMkv(...)");
        this.f161663m = Zi;
    }

    public final java.lang.String getBusiness() {
        java.lang.String str = this.business;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("business");
        throw null;
    }

    public final u60.e getOnAddr() {
        return this.onAddr;
    }

    public final java.lang.String getPermission() {
        java.lang.String str = this.permission;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("permission");
        throw null;
    }

    public final void setBusiness(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.business = str;
    }

    public final void setOnAddr(u60.e eVar) {
        kotlin.jvm.internal.o.g(eVar, "<set-?>");
        this.onAddr = eVar;
    }

    public final void setPermission(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.permission = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingPermissionView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f161667q = new x14.t(this);
        this.onAddr = new x14.u(this);
        c(attrs, i17);
        b(context);
    }
}
