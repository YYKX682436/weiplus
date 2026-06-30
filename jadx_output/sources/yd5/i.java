package yd5;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f461100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f461101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f461102f;

    public i(yd5.j jVar, boolean z17, boolean z18, int[] iArr) {
        this.f461100d = z17;
        this.f461101e = z18;
        this.f461102f = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = this.f461100d;
        int[] iArr = this.f461102f;
        if (!z17) {
            if (iArr[0] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 20, iArr[0]));
            }
            if (iArr[1] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 21, iArr[1]));
            }
            if (iArr[2] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 22, iArr[2]));
            }
            if (iArr[3] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 23, iArr[3]));
            }
            if (iArr[4] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 24, iArr[4]));
            }
            arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 39, 1));
        } else if (this.f461101e) {
            if (iArr[0] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 40, iArr[0]));
            }
            if (iArr[1] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 41, iArr[1]));
            }
            if (iArr[2] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 42, iArr[2]));
            }
            if (iArr[3] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 43, iArr[3]));
            }
            if (iArr[4] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 44, iArr[4]));
            }
            arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 59, 1));
        } else {
            if (iArr[0] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 0, iArr[0]));
            }
            if (iArr[1] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 1, iArr[1]));
            }
            if (iArr[2] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 2, iArr[2]));
            }
            if (iArr[3] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 3, iArr[3]));
            }
            if (iArr[4] > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 4, iArr[4]));
            }
            arrayList.add(new com.tencent.mars.smc.IDKey(uc1.o1.CTRL_INDEX, 19, 1));
        }
        jx3.f.INSTANCE.b(arrayList, true);
    }
}
