package lu1;

/* loaded from: classes8.dex */
public class o implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f321354d;

    public o(android.content.Context context) {
        this.f321354d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.autogen.events.GotoCardHomePageEvent gotoCardHomePageEvent = new com.tencent.mm.autogen.events.GotoCardHomePageEvent();
        gotoCardHomePageEvent.f54425g.f6154a = this.f321354d;
        gotoCardHomePageEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDialogHelper", "enter to cardhome");
    }
}
