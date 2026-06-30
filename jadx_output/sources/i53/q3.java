package i53;

/* loaded from: classes11.dex */
public class q3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameVideoDownloadUI f288698e;

    public q3(com.tencent.mm.plugin.game.media.GameVideoDownloadUI gameVideoDownloadUI, java.lang.String str) {
        this.f288698e = gameVideoDownloadUI;
        this.f288697d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = com.tencent.mm.plugin.game.media.GameVideoDownloadUI.f140070s;
        this.f288698e.T6(this.f288697d);
    }
}
