package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class fe extends androidx.recyclerview.widget.k3 {

    /* renamed from: g, reason: collision with root package name */
    public static final o11.g f199050g;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f199051d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f199052e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f199053f;

    static {
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.raw.app_brand_app_default_icon_for_tail;
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 20);
        int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 20);
        fVar.f342086j = b17;
        fVar.f342087k = b18;
        fVar.f342096t = true;
        fVar.f342078b = true;
        fVar.f342077a = true;
        f199050g = fVar.a();
    }

    public fe(android.view.View view) {
        super(view);
        this.f199051d = view;
        this.f199052e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.oev);
        this.f199053f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oex);
    }
}
