package id2;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.l f290606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(id2.l lVar) {
        super(6);
        this.f290606d = lVar;
    }

    @Override // yz5.t
    public java.lang.Object J(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        android.app.Activity context = (android.app.Activity) obj;
        android.content.Intent intent = (android.content.Intent) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        android.content.DialogInterface.OnClickListener onClickListener = (android.content.DialogInterface.OnClickListener) obj4;
        android.content.DialogInterface.OnClickListener onClickListener2 = (android.content.DialogInterface.OnClickListener) obj5;
        android.content.DialogInterface.OnDismissListener onDismissListener = (android.content.DialogInterface.OnDismissListener) obj6;
        kotlin.jvm.internal.o.g(context, "context");
        id2.m mVar = id2.m.f290662a;
        mVar.c("154");
        mVar.e("room_live_start_create_finder", "154");
        boolean z17 = com.tencent.mm.sdk.platformtools.o4.R("tag_live_core").getBoolean("anchor_verify", false);
        java.lang.String string = context.getString(com.tencent.mm.R.string.dkf);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = z17 ? context.getString(com.tencent.mm.R.string.dkd) : context.getString(com.tencent.mm.R.string.dke);
        kotlin.jvm.internal.o.d(string2);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context);
        z2Var.i(com.tencent.mm.R.layout.f488408sh);
        id2.l lVar = this.f290606d;
        android.widget.TextView textView = (android.widget.TextView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.f483979cm3);
        android.widget.TextView textView2 = (android.widget.TextView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.f483978cm2);
        android.view.View findViewById = z2Var.f212058g.findViewById(com.tencent.mm.R.id.b5i);
        android.view.View findViewById2 = z2Var.f212058g.findViewById(com.tencent.mm.R.id.khs);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        kotlin.jvm.internal.o.d(textView2);
        com.tencent.mm.ui.fk.a(textView2);
        textView.setText(string);
        textView2.setText(string2);
        findViewById.setOnClickListener(new id2.f(onClickListener2, z2Var));
        findViewById2.setOnClickListener(new id2.g(intent, lVar, context, intValue, onClickListener, z2Var));
        z2Var.l(new id2.h(onDismissListener));
        z2Var.C();
        return jz5.f0.f302826a;
    }
}
