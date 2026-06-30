package o45;

/* loaded from: classes12.dex */
public abstract class qi {
    public static java.util.Map a(byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            return null;
        }
        try {
            r45.gj6 gj6Var = (r45.gj6) new r45.gj6().parseFrom(bArr);
            if (gj6Var == null) {
                return null;
            }
            java.util.LinkedList linkedList = gj6Var.f375308e;
            if (linkedList.size() != gj6Var.f375307d) {
                return null;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            for (int i17 = 0; i17 < gj6Var.f375307d; i17++) {
                hashMap.put(java.lang.Integer.valueOf(((r45.o44) linkedList.get(i17)).f381904d), java.lang.Long.valueOf(((r45.o44) linkedList.get(i17)).f381905e & io.flutter.embedding.android.KeyboardMap.kValueMask));
            }
            if (hashMap.size() != gj6Var.f375307d) {
                return null;
            }
            return hashMap;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
        java.util.Map a17 = a(bArr);
        if (a17 == null) {
            return true;
        }
        java.util.Map a18 = a(bArr2);
        if (a18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncKeyUtil", "dkpush svr sync key failed");
            return false;
        }
        java.util.HashMap hashMap = (java.util.HashMap) a18;
        for (java.lang.Integer num : hashMap.keySet()) {
            java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) a17).get(num);
            java.lang.Long l18 = (java.lang.Long) hashMap.get(num);
            if (l17 == null || l18.longValue() > l17.longValue()) {
                return true;
            }
        }
        return false;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncKeyUtil", "newKey is null");
            return null;
        }
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        try {
            if (com.tencent.mm.protocal.MMProtocalJni.mergeSyncKey(bArr, bArr2, pByteArray)) {
                return pByteArray.value;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncKeyUtil", "merge key failed");
            return null;
        } catch (java.lang.IncompatibleClassChangeError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Crash", e17, "NoSuchMethod MMProtocalJni.mergeSyncKey", new java.lang.Object[0]);
            throw ((java.lang.IncompatibleClassChangeError) new java.lang.IncompatibleClassChangeError("NoSuchMethod MMProtocalJni.mergeSyncKey").initCause(e17));
        }
    }

    public static java.lang.String d(byte[] bArr) {
        java.util.Map a17;
        if (!com.tencent.mm.sdk.platformtools.t8.M0(bArr) && (a17 = a(bArr)) != null) {
            java.util.HashMap hashMap = (java.util.HashMap) a17;
            if (hashMap.size() >= 1) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                stringBuffer.append(" MsgKey:" + hashMap.get(2));
                stringBuffer.append(" profile:" + hashMap.get(1));
                stringBuffer.append(" contact:" + hashMap.get(3));
                stringBuffer.append(" chatroom:" + hashMap.get(11));
                stringBuffer.append(" Bottle:" + hashMap.get(7));
                stringBuffer.append(" QContact:" + hashMap.get(5));
                return stringBuffer.toString();
            }
        }
        return "";
    }
}
