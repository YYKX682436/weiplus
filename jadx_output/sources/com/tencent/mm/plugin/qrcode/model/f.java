package com.tencent.mm.plugin.qrcode.model;

/* loaded from: classes.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f154957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f154958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154959f;

    public f(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        this.f154957d = context;
        this.f154958e = intent;
        this.f154959f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        try {
            android.content.Context context = this.f154957d;
            if (context != null) {
                android.content.Intent intent = this.f154958e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.scanner.GetA8KeyRedirect", e17, "", new java.lang.Object[0]);
            android.content.Context context2 = this.f154957d;
            if (context2 != null) {
                db5.t7.g(context2, this.f154959f);
            }
        }
    }
}
