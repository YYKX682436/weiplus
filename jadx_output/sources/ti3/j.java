package ti3;

/* loaded from: classes9.dex */
public class j implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f419622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ti3.m f419623b;

    public j(android.content.Context context, ti3.m mVar) {
        this.f419622a = context;
        this.f419623b = mVar;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.MsgQuoteHelp", "dealQuoteTing() bitmap is null");
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Bitmap a17 = com.tencent.mm.ui.sk.a(ti3.i.n(this.f419622a, bitmap, width, height), true, com.tencent.mm.ui.zk.a(r4, 3), false);
        ti3.m mVar = this.f419623b;
        mVar.f419629a.setImageBitmap(a17);
        ti3.i.p(mVar.f419629a);
    }
}
