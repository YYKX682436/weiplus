package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.s f206939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f206940e;

    public w(com.tencent.mm.ui.contact.item.z zVar, com.tencent.mm.ui.contact.item.s sVar, android.content.Context context) {
        this.f206939d = sVar;
        this.f206940e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.item.s sVar = this.f206939d;
        int top = sVar.f206926d.getTop() - sVar.f206925c.getBottom();
        android.content.Context context = this.f206940e;
        int b17 = top - i65.a.b(context, 4);
        if (b17 < 0) {
            b17 = 0;
        }
        if (sVar.f206926d.getTop() - sVar.f206925c.getBottom() == i65.a.b(context, 4)) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) sVar.f206926d.getLayoutParams();
        layoutParams.topMargin = -b17;
        sVar.f206926d.setLayoutParams(layoutParams);
    }
}
