package nl;

/* loaded from: classes10.dex */
public class d {

    /* renamed from: j, reason: collision with root package name */
    public static int f338137j = 18432;

    /* renamed from: a, reason: collision with root package name */
    public int f338138a;

    /* renamed from: b, reason: collision with root package name */
    public int f338139b;

    /* renamed from: c, reason: collision with root package name */
    public int f338140c;

    /* renamed from: d, reason: collision with root package name */
    public int f338141d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f338142e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f338143f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f338144g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f338145h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public nl.g f338146i;

    public d() {
        nl.c cVar = new nl.c();
        this.f338146i = cVar;
        if (cVar.f338136a == null) {
            cVar.f338136a = new nl.h();
        }
    }

    public byte[] a(java.util.List list) {
        java.lang.Object obj;
        kl.k kVar;
        int i17;
        byte[] bArr;
        int i18;
        int i19;
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = list.size() > 1;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            hl.e eVar = (hl.e) it.next();
            if (eVar == null || eVar.f282038f == null || android.text.TextUtils.isEmpty(eVar.f282033a)) {
                int i27 = rl.b.f397143a;
                obj = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioSyncMixController", "track or pcmData is null, or audioId is empty", null);
            } else {
                java.util.HashMap hashMap = this.f338143f;
                if (hashMap.containsKey(eVar.f282033a)) {
                    kVar = (kl.k) hashMap.get(eVar.f282033a);
                } else {
                    kl.i iVar = new kl.i(eVar.f282033a, eVar.f282034b, eVar.f282035c, eVar.f282036d, this.f338138a, this.f338139b, this.f338140c);
                    hashMap.put(eVar.f282033a, iVar);
                    kVar = iVar;
                }
                hl.e eVar2 = new hl.e();
                byte[] a17 = kVar.a(eVar.f282038f);
                eVar2.f282038f = a17;
                java.lang.String str = eVar.f282033a;
                eVar2.f282033a = str;
                eVar2.f282037e = eVar.f282037e;
                eVar2.f282035c = eVar.f282035c;
                eVar2.f282034b = eVar.f282034b;
                eVar2.f282036d = eVar.f282036d;
                if (z17 && a17 != null && a17.length != 0) {
                    java.util.HashMap hashMap2 = this.f338144g;
                    boolean containsKey = hashMap2.containsKey(str);
                    java.util.HashMap hashMap3 = this.f338145h;
                    if (containsKey) {
                        bArr = (byte[]) hashMap2.get(eVar2.f282033a);
                        i17 = ((java.lang.Integer) hashMap3.get(eVar2.f282033a)).intValue();
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    if (i17 <= 0 || bArr == null) {
                        int length = a17.length;
                        int i28 = this.f338141d;
                        if (length < i28) {
                            byte[] bArr2 = new byte[i28];
                            java.util.Arrays.fill(bArr2, 0, i28, (byte) 0);
                            java.lang.System.arraycopy(a17, 0, bArr2, 0, a17.length);
                            eVar2.f282038f = bArr2;
                        } else if (a17.length > i28) {
                            byte[] bArr3 = new byte[i28];
                            java.util.Arrays.fill(bArr3, 0, i28, (byte) 0);
                            java.lang.System.arraycopy(a17, 0, bArr3, 0, this.f338141d);
                            eVar2.f282038f = bArr3;
                            if (bArr == null) {
                                int length2 = a17.length;
                                int i29 = f338137j;
                                if (length2 > i29) {
                                    i29 = a17.length;
                                }
                                f338137j = i29;
                                bArr = new byte[i29];
                            }
                            java.util.Arrays.fill(bArr, 0, f338137j, (byte) 0);
                            int i37 = this.f338141d;
                            java.lang.System.arraycopy(a17, i37, bArr, 0, a17.length - i37);
                            hashMap3.put(eVar2.f282033a, java.lang.Integer.valueOf(a17.length - this.f338141d));
                            hashMap2.put(eVar2.f282033a, bArr);
                        }
                    } else {
                        int length3 = a17.length;
                        int i38 = f338137j - i17;
                        if (length3 <= i38) {
                            java.lang.System.arraycopy(a17, 0, bArr, i17, a17.length);
                            i18 = a17.length;
                        } else {
                            java.lang.System.arraycopy(a17, 0, bArr, i17, i38);
                            i18 = f338137j - i17;
                        }
                        int i39 = i17 + i18;
                        int i47 = this.f338141d;
                        if (i39 > i47) {
                            i19 = i39 - i47;
                            byte[] bArr4 = new byte[i47];
                            java.lang.System.arraycopy(bArr, 0, bArr4, 0, i47);
                            eVar2.f282038f = bArr4;
                            byte[] bArr5 = new byte[i19];
                            java.lang.System.arraycopy(bArr, this.f338141d, bArr5, 0, i19);
                            java.util.Arrays.fill(bArr, 0, f338137j, (byte) 0);
                            java.lang.System.arraycopy(bArr5, 0, bArr, 0, i19);
                        } else {
                            byte[] bArr6 = new byte[i47];
                            java.lang.System.arraycopy(bArr, 0, bArr6, 0, i39);
                            eVar2.f282038f = bArr6;
                            java.util.Arrays.fill(bArr, 0, f338137j, (byte) 0);
                            i19 = 0;
                        }
                        hashMap3.put(eVar2.f282033a, java.lang.Integer.valueOf(i19));
                        hashMap2.put(eVar2.f282033a, bArr);
                    }
                }
                if (eVar2.f282038f.equals(eVar.f282038f)) {
                    byte[] bArr7 = eVar2.f282038f;
                    byte[] bArr8 = new byte[bArr7.length];
                    java.lang.System.arraycopy(bArr7, 0, bArr8, 0, bArr7.length);
                    eVar2.f282038f = bArr8;
                }
                eVar = eVar2;
                obj = null;
            }
            arrayList.add(eVar);
        }
        return b(arrayList);
    }

    public final byte[] b(java.util.List list) {
        if (list == null || list.isEmpty()) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioSyncMixController", "list is invalid", null);
            return null;
        }
        if (list.size() == 1) {
            return ((hl.e) list.get(0)).f282038f;
        }
        nl.g gVar = this.f338146i;
        if (gVar == null) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioSyncMixController", "mixer is null", null);
            return null;
        }
        hl.b a17 = ((nl.c) gVar).a(list);
        if (a17 != null) {
            return a17.f282016c;
        }
        return null;
    }
}
