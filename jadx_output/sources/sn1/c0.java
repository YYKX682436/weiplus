package sn1;

/* loaded from: classes12.dex */
public class c0 implements ln1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sn1.f0 f409997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f409998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sn1.e0 f409999c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f410001e;

    public c0(sn1.f0 f0Var, java.util.LinkedList linkedList, sn1.e0 e0Var, java.lang.String str, byte[] bArr) {
        this.f409997a = f0Var;
        this.f409998b = linkedList;
        this.f409999c = e0Var;
        this.f410000d = str;
        this.f410001e = bArr;
    }

    @Override // ln1.z
    public void a(java.lang.Object obj) {
        ((ln1.e0) this.f409997a).a((sn1.a0) obj);
        int i17 = sn1.a0.A;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupDataPushScene", "out backupList:%d", java.lang.Integer.valueOf(this.f409998b.size()));
    }

    @Override // ln1.z
    public java.lang.Object run() {
        return new sn1.a0(this.f409999c, this.f410000d, this.f409998b, this.f410001e, null);
    }
}
