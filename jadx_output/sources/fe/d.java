package fe;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f261349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fe.g f261350e;

    public d(fe.g gVar, long j17) {
        this.f261350e = gVar;
        this.f261349d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f261349d <= 0) {
            return;
        }
        synchronized (this.f261350e.f261362j) {
            long j17 = this.f261349d;
            if (j17 < 5120) {
                if (this.f261350e.f261362j.a(0)) {
                    fe.f fVar = this.f261350e.f261362j;
                    fVar.put(0, fVar.get(0) + 1);
                } else {
                    this.f261350e.f261362j.put(0, 1);
                }
            } else if (j17 < 10240) {
                if (this.f261350e.f261362j.a(1)) {
                    fe.f fVar2 = this.f261350e.f261362j;
                    fVar2.put(1, fVar2.get(1) + 1);
                } else {
                    this.f261350e.f261362j.put(1, 1);
                }
            } else if (j17 < 20480) {
                if (this.f261350e.f261362j.a(2)) {
                    fe.f fVar3 = this.f261350e.f261362j;
                    fVar3.put(2, fVar3.get(2) + 1);
                } else {
                    this.f261350e.f261362j.put(2, 1);
                }
            } else if (j17 < 51200) {
                if (this.f261350e.f261362j.a(3)) {
                    fe.f fVar4 = this.f261350e.f261362j;
                    fVar4.put(3, fVar4.get(3) + 1);
                } else {
                    this.f261350e.f261362j.put(3, 1);
                }
            } else if (j17 < 102400) {
                if (this.f261350e.f261362j.a(4)) {
                    fe.f fVar5 = this.f261350e.f261362j;
                    fVar5.put(4, fVar5.get(4) + 1);
                } else {
                    this.f261350e.f261362j.put(4, 1);
                }
            } else if (j17 < 153600) {
                if (this.f261350e.f261362j.a(5)) {
                    fe.f fVar6 = this.f261350e.f261362j;
                    fVar6.put(5, fVar6.get(5) + 1);
                } else {
                    this.f261350e.f261362j.put(5, 1);
                }
            } else if (j17 < 204800) {
                if (this.f261350e.f261362j.a(6)) {
                    fe.f fVar7 = this.f261350e.f261362j;
                    fVar7.put(6, fVar7.get(6) + 1);
                } else {
                    this.f261350e.f261362j.put(6, 1);
                }
            } else if (j17 < 512000) {
                if (this.f261350e.f261362j.a(7)) {
                    fe.f fVar8 = this.f261350e.f261362j;
                    fVar8.put(7, fVar8.get(7) + 1);
                } else {
                    this.f261350e.f261362j.put(7, 1);
                }
            } else if (j17 < 1048576) {
                if (this.f261350e.f261362j.a(8)) {
                    fe.f fVar9 = this.f261350e.f261362j;
                    fVar9.put(8, fVar9.get(8) + 1);
                } else {
                    this.f261350e.f261362j.put(8, 1);
                }
            } else if (j17 < 2097152) {
                if (this.f261350e.f261362j.a(9)) {
                    fe.f fVar10 = this.f261350e.f261362j;
                    fVar10.put(9, fVar10.get(9) + 1);
                } else {
                    this.f261350e.f261362j.put(9, 1);
                }
            } else if (j17 < 3145728) {
                if (this.f261350e.f261362j.a(10)) {
                    fe.f fVar11 = this.f261350e.f261362j;
                    fVar11.put(10, fVar11.get(10) + 1);
                } else {
                    this.f261350e.f261362j.put(10, 1);
                }
            } else if (this.f261350e.f261362j.a(11)) {
                fe.f fVar12 = this.f261350e.f261362j;
                fVar12.put(11, fVar12.get(11) + 1);
            } else {
                this.f261350e.f261362j.put(11, 1);
            }
        }
    }
}
