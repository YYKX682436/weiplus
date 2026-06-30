package os3;

/* loaded from: classes11.dex */
public class k3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI f348137g;

    public k3(com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI prepareBindXMailUI, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f348137g = prepareBindXMailUI;
        this.f348134d = str;
        this.f348135e = str2;
        this.f348136f = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI.f154914p;
        this.f348137g.V6(this.f348134d, this.f348135e, this.f348136f);
    }
}
