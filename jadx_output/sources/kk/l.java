package kk;

/* loaded from: classes15.dex */
public class l extends com.tencent.mm.sdk.platformtools.r2 implements kk.j {

    /* renamed from: i, reason: collision with root package name */
    public final kk.h f308466i;

    /* renamed from: j, reason: collision with root package name */
    public final kk.i f308467j;

    public l(int i17) {
        super(i17);
        this.f308466i = null;
        this.f308467j = null;
    }

    @Override // kk.j
    public void c(kk.g gVar) {
        clear();
    }

    @Override // kk.j
    public void clear() {
        super.d(-1);
    }

    @Override // com.tencent.mm.sdk.platformtools.r2, kk.j
    public void d(int i17) {
        super.d(i17);
    }

    @Override // com.tencent.mm.sdk.platformtools.r2
    public int g(java.lang.Object obj, java.lang.Object obj2) {
        kk.i iVar = this.f308467j;
        if (iVar != null) {
            return iVar.a(obj, obj2);
        }
        return 1;
    }

    @Override // kk.j
    public void j(java.lang.Object obj, java.lang.Object obj2) {
        if (obj2 == null || obj == null) {
            return;
        }
        put(obj, obj2);
    }

    @Override // com.tencent.mm.sdk.platformtools.r2
    public java.lang.Object n(java.lang.Object obj) {
        return null;
    }

    @Override // com.tencent.mm.sdk.platformtools.r2
    public void o(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kk.h hVar = this.f308466i;
        if (hVar != null) {
            hVar.a(obj, obj2, obj3);
        }
    }

    public l(int i17, kk.h hVar) {
        super(i17);
        this.f308466i = null;
        this.f308467j = null;
        this.f308466i = hVar;
    }

    public l(int i17, kk.h hVar, kk.i iVar) {
        super(i17);
        this.f308466i = null;
        this.f308467j = null;
        this.f308466i = hVar;
        this.f308467j = iVar;
    }
}
