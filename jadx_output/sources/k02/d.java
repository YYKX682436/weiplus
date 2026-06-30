package k02;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f303069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f303070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.a5 f303071g;

    public d(android.content.Context context, com.tencent.mm.pluginsdk.model.app.m mVar, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, com.tencent.mm.pluginsdk.model.app.a5 a5Var) {
        this.f303068d = context;
        this.f303069e = mVar;
        this.f303070f = wXMediaMessage;
        this.f303071g = a5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f303068d;
        com.tencent.mm.pluginsdk.model.app.m mVar = this.f303069e;
        com.tencent.mm.pluginsdk.model.app.w.w(context, mVar.field_packageName, this.f303070f, mVar.field_appId, mVar.field_openId, 0, this.f303071g, null);
    }
}
