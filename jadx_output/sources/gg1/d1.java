package gg1;

/* loaded from: classes7.dex */
public final class d1 implements x91.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.k1 f271552d;

    public d1(gg1.k1 k1Var) {
        this.f271552d = k1Var;
    }

    @Override // x91.a
    public void C2(x91.h device) {
        kotlin.jvm.internal.o.g(device, "device");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "onAddDevice: " + device);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoCast.VideoCastDeviceManager", "onAddDevice", e17);
        }
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        x91.c cVar = device.f452647a;
        boolean z17 = false;
        boolean z18 = L.getLong(cVar != null ? cVar.f452641i : null, 0L) != 0;
        gg1.k1 k1Var = this.f271552d;
        if (z18) {
            java.util.ArrayList arrayList = k1Var.f271592e;
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
                k1Var.f271592e.add(new gg1.i(device));
            }
        } else {
            java.util.ArrayList arrayList2 = k1Var.f271591d;
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
                k1Var.f271591d.add(new gg1.i(device));
            }
        }
        yz5.a aVar = k1Var.f271593f;
        if (aVar != null) {
            aVar.invoke();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAddDevice: ");
        sb6.append(cVar != null ? cVar.f452639g : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", sb6.toString());
    }

    @Override // x91.a
    public void K4(x91.h device) {
        kotlin.jvm.internal.o.g(device, "device");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "onUpdateDevice: " + device);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoCast.VideoCastDeviceManager", "onUpdateDevice", e17);
        }
    }

    @Override // x91.a
    public void q2(x91.h device) {
        kotlin.jvm.internal.o.g(device, "device");
        gg1.k1 k1Var = this.f271552d;
        k1Var.f271591d.remove(new gg1.i(device));
        k1Var.f271592e.remove(new gg1.i(device));
        yz5.a aVar = k1Var.f271593f;
        if (aVar != null) {
            aVar.invoke();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRemoveDevice: ");
        x91.c cVar = device.f452647a;
        sb6.append(cVar != null ? cVar.f452639g : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", sb6.toString());
    }
}
