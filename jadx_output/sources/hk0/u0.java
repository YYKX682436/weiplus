package hk0;

/* loaded from: classes3.dex */
public final class u0 extends androidx.lifecycle.c1 {

    /* renamed from: d */
    public final androidx.lifecycle.y f281813d;

    /* renamed from: e */
    public final java.util.HashMap f281814e;

    /* renamed from: f */
    public final java.util.HashMap f281815f;

    /* renamed from: g */
    public androidx.lifecycle.j0 f281816g;

    /* renamed from: h */
    public androidx.lifecycle.j0 f281817h;

    /* renamed from: i */
    public hk0.z f281818i;

    /* renamed from: m */
    public kotlinx.coroutines.flow.j2 f281819m;

    /* renamed from: n */
    public kotlinx.coroutines.flow.j2 f281820n;

    /* renamed from: o */
    public hk0.o f281821o;

    /* renamed from: p */
    public final kotlinx.coroutines.y0 f281822p;

    /* renamed from: q */
    public int f281823q;

    /* renamed from: r */
    public int f281824r;

    /* renamed from: s */
    public int f281825s;

    /* renamed from: t */
    public int f281826t;

    public u0(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        this.f281813d = owner;
        this.f281814e = new java.util.HashMap();
        this.f281815f = new java.util.HashMap();
        this.f281816g = new androidx.lifecycle.j0();
        this.f281817h = new androidx.lifecycle.j0();
        this.f281818i = new hk0.z();
        this.f281819m = kotlinx.coroutines.flow.i3.a(new java.util.ArrayList());
        this.f281820n = kotlinx.coroutines.flow.i3.a(new java.util.ArrayList());
        this.f281822p = kotlinx.coroutines.z0.b();
        W6();
    }

    public static final java.lang.Object N6(hk0.u0 u0Var, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        u0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "emitEditaDataEvent: dataSize >> " + arrayList.size());
        ((kotlinx.coroutines.flow.h3) u0Var.f281820n).emit(arrayList, continuation);
        pz5.a aVar = pz5.a.f359186d;
        return jz5.f0.f302826a;
    }

    public static final java.lang.Object O6(hk0.u0 u0Var, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        u0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "emitEditEventData >> " + arrayList.size());
        ((kotlinx.coroutines.flow.h3) u0Var.f281819m).emit(arrayList, continuation);
        pz5.a aVar = pz5.a.f359186d;
        return jz5.f0.f302826a;
    }

    public static /* synthetic */ void e7(hk0.u0 u0Var, int i17, java.lang.Boolean bool, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            bool = null;
        }
        u0Var.d7(i17, bool);
    }

    public final void P6(xk0.k item, hk0.z0 mosaicType) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(mosaicType, "mosaicType");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "addMosaic >> ".concat(this.f281818i.b(mosaicType, item)));
        kotlinx.coroutines.l.d(this.f281822p, null, null, new hk0.f0(this, V6(new java.util.ArrayList()), null), 3, null);
    }

    public final void Q6(hk0.p type, java.lang.String str, int i17, int i18, java.lang.String font) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(font, "font");
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImproveEditPhotoStateModel", "addText but text is nullOrEmpty");
            return;
        }
        hk0.z zVar = this.f281818i;
        zVar.getClass();
        java.lang.String str2 = "TEXT_" + java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addTextData >> type: " + type + ", editId: " + str2);
        java.util.LinkedList linkedList = zVar.f281849a;
        hk0.l lVar = hk0.l.f281766g;
        linkedList.add(new hk0.k(lVar, str2));
        zVar.f281854f.put(str2, new hk0.a1(lVar, type, str, i17, i18, font, null, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "addText >> " + type + ' ' + str2);
        kotlinx.coroutines.l.d(this.f281822p, null, null, new hk0.h0(this, V6(new java.util.ArrayList()), str2, null), 3, null);
    }

    public final boolean R6(int i17) {
        hk0.o oVar;
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) this.f281814e.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null || (oVar = (hk0.o) j0Var.getValue()) == null) {
            return false;
        }
        return oVar.f281783b;
    }

    public final hk0.z0 S6() {
        hk0.z0 z0Var;
        hk0.y0 y0Var = (hk0.y0) this.f281817h.getValue();
        return (y0Var == null || (z0Var = y0Var.f281846a) == null) ? hk0.z0.f281862d : z0Var;
    }

    public final hk0.e T6() {
        hk0.e eVar;
        hk0.g gVar = (hk0.g) this.f281816g.getValue();
        return (gVar == null || (eVar = gVar.f281734a) == null) ? new hk0.e(hk0.h.f281739d, 0, 0, 6, null) : eVar;
    }

    public final hk0.j U6() {
        hk0.z zVar = this.f281818i;
        int i17 = zVar.f281857i;
        boolean z17 = zVar.f281859k;
        java.util.LinkedList linkedList = zVar.f281856h;
        hk0.d dVar = linkedList.isEmpty() ? null : (hk0.d) zVar.f281851c.get(linkedList.getLast());
        boolean z18 = z17 || i17 != 0 || (dVar != null && dVar.f281716e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getRotateAndCropRestoreState >> rotate=");
        sb6.append(i17);
        sb6.append(", hasCrop=");
        sb6.append(z17);
        sb6.append(", lastCrop=");
        sb6.append(dVar != null);
        sb6.append(", isCanRestore=");
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", sb6.toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("BUNDLE_KEY_BOOLEAN_1", z18);
        return new hk0.j(3, bundle);
    }

    public final java.util.ArrayList V6(java.util.ArrayList editEventList) {
        kotlin.jvm.internal.o.g(editEventList, "editEventList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(editEventList);
        if (this.f281818i.f281849a.size() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "emit EVENT_UNDO_ENABLE true");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("BUNDLE_KEY_BOOLEAN_1", true);
            arrayList.add(new hk0.j(1, bundle));
        }
        if (this.f281818i.f281850b.size() != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "emit EVENT_FORWARD_ENABLE false");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("BUNDLE_KEY_BOOLEAN_1", false);
            arrayList.add(new hk0.j(2, bundle2));
            this.f281818i.f281850b.clear();
        }
        return arrayList;
    }

    public final void W6() {
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0();
        java.util.HashMap hashMap = this.f281814e;
        hashMap.put(1, j0Var);
        hashMap.put(2, new androidx.lifecycle.j0());
        hashMap.put(3, new androidx.lifecycle.j0());
        hashMap.put(4, new androidx.lifecycle.j0());
        hashMap.put(5, new androidx.lifecycle.j0());
        hashMap.put(6, new androidx.lifecycle.j0());
        hashMap.put(10, new androidx.lifecycle.j0());
        this.f281815f.put(1, new androidx.lifecycle.j0());
    }

    public final void X6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "notifyCrop");
        hk0.z zVar = this.f281818i;
        if (zVar.f281859k) {
            return;
        }
        zVar.f281859k = true;
        kotlinx.coroutines.l.d(this.f281822p, null, null, new hk0.l0(this, null), 3, null);
    }

    public final void Y6() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new hk0.j(4, new android.os.Bundle()));
        kotlinx.coroutines.l.d(this.f281822p, null, null, new hk0.m0(this, arrayList, null), 3, null);
    }

    public final void Z6(int i17, androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) this.f281814e.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        j0Var.observe(this.f281813d, observer);
    }

    public final void a7(int i17, androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) this.f281815f.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        j0Var.observe(this.f281813d, observer);
    }

    public final void b7(hk0.e doodleBean) {
        hk0.e eVar;
        kotlin.jvm.internal.o.g(doodleBean, "doodleBean");
        hk0.g gVar = (hk0.g) this.f281816g.getValue();
        if (gVar == null || (eVar = gVar.f281734a) == null) {
            eVar = new hk0.e(hk0.h.f281739d, 0, 0, 6, null);
        }
        this.f281816g.postValue(new hk0.g(doodleBean, eVar));
    }

    public final java.lang.String c7(xk0.f emojiItem, hk0.p handleType) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(emojiItem, "emojiItem");
        kotlin.jvm.internal.o.g(handleType, "handleType");
        java.lang.String str2 = emojiItem.f454966x;
        boolean z17 = str2 != null && r26.n0.B(str2, "EMOJI", false);
        kotlinx.coroutines.y0 y0Var = this.f281822p;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "updateEmojiOrTextItem >> emoji " + handleType);
            hk0.z zVar = this.f281818i;
            zVar.getClass();
            java.lang.String str3 = "EMOJI_" + java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addUpdateEmojiItem >> editId: " + emojiItem.f454966x + ' ' + handleType + ' ' + str3);
            java.util.LinkedList linkedList = zVar.f281849a;
            hk0.l lVar = hk0.l.f281767h;
            linkedList.add(new hk0.k(lVar, str3));
            java.util.HashMap hashMap = zVar.f281855g;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = emojiItem.f454951f;
            kotlin.jvm.internal.o.f(iEmojiInfo, "getEmojiInfo(...)");
            hashMap.put(str3, new hk0.m(lVar, handleType, iEmojiInfo, emojiItem, emojiItem.f454966x));
            emojiItem.f454966x = str3;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "updateEmojiData ".concat(str3));
            kotlinx.coroutines.l.d(y0Var, null, null, new hk0.r0(this, V6(new java.util.ArrayList()), null), 3, null);
            return str3;
        }
        java.lang.String str4 = emojiItem.f454966x;
        if (!(str4 != null && r26.n0.B(str4, "TEXT", false))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoStateModel", "updateEmojiOrTextItem error >> " + emojiItem.f454966x);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "updateEmojiOrTextItem >> text " + handleType);
        xk0.p pVar = (xk0.p) emojiItem;
        hk0.z zVar2 = this.f281818i;
        zVar2.getClass();
        java.lang.String str5 = "TEXT_" + java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addEmojiUpdateItem >> " + handleType + " emojiItemEditId: " + pVar.f454966x + " currentId: " + str5);
        java.util.LinkedList linkedList2 = zVar2.f281849a;
        hk0.l lVar2 = hk0.l.f281766g;
        linkedList2.add(new hk0.k(lVar2, str5));
        java.util.HashMap hashMap2 = zVar2.f281854f;
        java.lang.String spannableString = pVar.E.toString();
        int i17 = pVar.A;
        int i18 = pVar.B;
        cm5.m mVar = pVar.F;
        if (mVar == null || (str = mVar.f43449c) == null) {
            str = "";
        }
        hashMap2.put(str5, new hk0.a1(lVar2, handleType, spannableString, i17, i18, str, pVar, pVar.f454966x));
        pVar.f454966x = str5;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "updateText >> " + handleType + ", editId: " + pVar.f454966x + " newEditId: " + str5);
        kotlinx.coroutines.l.d(y0Var, null, null, new hk0.t0(this, V6(new java.util.ArrayList()), null), 3, null);
        return str5;
    }

    public final void d7(int i17, java.lang.Boolean bool) {
        jz5.f0 f0Var;
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) this.f281814e.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        if (bool != null) {
            bool.booleanValue();
            j0Var.postValue(new hk0.o(i17, bool.booleanValue()));
            f7(bool.booleanValue(), i17);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            hk0.o oVar = (hk0.o) j0Var.getValue();
            boolean z17 = oVar != null ? oVar.f281783b : false;
            j0Var.postValue(new hk0.o(i17, !z17));
            f7(!z17, i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r3.f281783b == true) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f7(boolean r6, int r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L38
            hk0.o r0 = r5.f281821o
            if (r0 == 0) goto L32
            int r0 = r0.f281782a
            if (r7 == r0) goto L32
            java.util.HashMap r1 = r5.f281814e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            androidx.lifecycle.j0 r1 = (androidx.lifecycle.j0) r1
            r2 = 0
            if (r1 == 0) goto L27
            java.lang.Object r3 = r1.getValue()
            hk0.o r3 = (hk0.o) r3
            if (r3 == 0) goto L27
            r4 = 1
            boolean r3 = r3.f281783b
            if (r3 != r4) goto L27
            goto L28
        L27:
            r4 = r2
        L28:
            if (r4 == 0) goto L32
            hk0.o r3 = new hk0.o
            r3.<init>(r0, r2)
            r1.postValue(r3)
        L32:
            hk0.o r0 = new hk0.o
            r0.<init>(r7, r6)
            goto L39
        L38:
            r0 = 0
        L39:
            r5.f281821o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hk0.u0.f7(boolean, int):void");
    }

    public final void g7(hk0.z0 mosaicType, boolean z17) {
        hk0.z0 z0Var;
        kotlin.jvm.internal.o.g(mosaicType, "mosaicType");
        hk0.y0 y0Var = (hk0.y0) this.f281817h.getValue();
        if (y0Var == null || (z0Var = y0Var.f281846a) == null) {
            z0Var = hk0.z0.f281862d;
        }
        this.f281817h.postValue(new hk0.y0(mosaicType, z0Var, z17));
    }

    public final void h7(int i17, boolean z17) {
        jz5.f0 f0Var;
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) this.f281815f.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        hk0.c1 c1Var = (hk0.c1) j0Var.getValue();
        if (c1Var != null) {
            if (c1Var.f281712b != z17) {
                j0Var.postValue(new hk0.c1(i17, z17));
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            j0Var.postValue(new hk0.c1(i17, z17));
        }
    }
}
