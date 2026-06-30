package os3;

/* loaded from: classes11.dex */
public class l3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI f348145f;

    public l3(com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI prepareBindXMailUI, java.lang.String str, java.lang.String str2) {
        this.f348145f = prepareBindXMailUI;
        this.f348143d = str;
        this.f348144e = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI.f154914p;
        this.f348145f.U6(this.f348143d, this.f348144e, "", "");
    }
}
