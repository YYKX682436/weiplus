package mj4;

/* loaded from: classes11.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj4.v f327080d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(mj4.v vVar) {
        super(0);
        this.f327080d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int e17 = c01.id.e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select rowid, * from TextStatus where ExpireTime > ");
        java.lang.String[] strArr = mj4.v.f327081f;
        sb6.append(e17);
        sb6.append(' ');
        android.database.Cursor B = this.f327080d.f327082d.B(sb6.toString(), null);
        if (B != null) {
            while (B.moveToNext()) {
                mj4.a aVar = new mj4.a();
                aVar.convertFrom(B);
                concurrentHashMap.put(aVar.field_UserName, aVar);
            }
            B.close();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("init time ");
        sb7.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb7.append(" serverCurTime:");
        sb7.append(e17);
        sb7.append(" size:");
        sb7.append(B != null ? java.lang.Integer.valueOf(B.getCount()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusStorage", sb7.toString());
        return concurrentHashMap;
    }
}
