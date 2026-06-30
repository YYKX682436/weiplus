package ts3;

/* loaded from: classes9.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts3.h f421649d;

    public d(ts3.h hVar) {
        this.f421649d = hVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15413, 4, "", "");
        ts3.h hVar = this.f421649d;
        hVar.b(hVar.f421670e, false, null);
    }
}
