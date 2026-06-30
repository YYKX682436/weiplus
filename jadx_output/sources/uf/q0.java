package uf;

/* loaded from: classes7.dex */
public final class q0 implements x91.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c1 f427090d;

    public q0(uf.c1 c1Var) {
        this.f427090d = c1Var;
    }

    @Override // x91.a
    public void C2(x91.h device) {
        long j17;
        kotlin.jvm.internal.o.g(device, "device");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastDeviceManager", "[search]onAddDevice, " + device);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaCastDeviceManager", "[search]onAddDevice", e17);
        }
        uf.c1 c1Var = this.f427090d;
        com.tencent.mm.sdk.platformtools.o4 d17 = c1Var.d();
        x91.c cVar = device.f452647a;
        if (d17 != null) {
            j17 = d17.getLong(cVar != null ? cVar.f452641i : null, 0L);
        } else {
            j17 = 0;
        }
        boolean z17 = false;
        if (0 != j17) {
            java.util.ArrayList arrayList = c1Var.f426985d;
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    x91.c cVar2 = ((gg1.i) it.next()).f271568a.f452647a;
                    kotlin.jvm.internal.o.d(cVar2);
                    java.lang.String str = cVar2.f452641i;
                    kotlin.jvm.internal.o.d(cVar);
                    if (kotlin.jvm.internal.o.b(str, cVar.f452641i)) {
                        break;
                    }
                }
            }
            z17 = true;
            if (z17) {
                c1Var.f426985d.add(new gg1.i(device));
            }
        } else {
            java.util.ArrayList arrayList2 = c1Var.f426984c;
            if (!(arrayList2 instanceof java.util.Collection) || !arrayList2.isEmpty()) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    x91.c cVar3 = ((gg1.i) it6.next()).f271568a.f452647a;
                    kotlin.jvm.internal.o.d(cVar3);
                    java.lang.String str2 = cVar3.f452641i;
                    kotlin.jvm.internal.o.d(cVar);
                    if (kotlin.jvm.internal.o.b(str2, cVar.f452641i)) {
                        break;
                    }
                }
            }
            z17 = true;
            if (z17) {
                c1Var.f426984c.add(new gg1.i(device));
            }
        }
        yz5.a aVar = c1Var.f426986e;
        if (aVar != null) {
            aVar.invoke();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[search]onAddDevice, ");
        sb6.append(cVar != null ? cVar.f452639g : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastDeviceManager", sb6.toString());
    }

    @Override // x91.a
    public void K4(x91.h device) {
        kotlin.jvm.internal.o.g(device, "device");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastDeviceManager", "[search]onUpdateDevice, " + device);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaCastDeviceManager", "[search]onUpdateDevice", e17);
        }
    }

    @Override // x91.a
    public void q2(x91.h device) {
        kotlin.jvm.internal.o.g(device, "device");
        uf.c1 c1Var = this.f427090d;
        c1Var.f426984c.remove(new gg1.i(device));
        c1Var.f426985d.remove(new gg1.i(device));
        yz5.a aVar = c1Var.f426986e;
        if (aVar != null) {
            aVar.invoke();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[search]onRemoveDevice, ");
        x91.c cVar = device.f452647a;
        sb6.append(cVar != null ? cVar.f452639g : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastDeviceManager", sb6.toString());
    }
}
