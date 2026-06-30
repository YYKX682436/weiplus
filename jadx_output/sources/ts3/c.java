package ts3;

/* loaded from: classes9.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts3.h f421640d;

    public c(ts3.h hVar) {
        this.f421640d = hVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Context context = this.f421640d.f421670e;
        ss3.d0.wi(new ts3.b(this, db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.hrc), false, false, null)));
    }
}
