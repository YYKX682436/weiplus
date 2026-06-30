package s9;

/* loaded from: classes13.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f404962a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f404963b;

    /* renamed from: c, reason: collision with root package name */
    public final t9.c f404964c;

    /* renamed from: d, reason: collision with root package name */
    public final javax.crypto.Cipher f404965d;

    /* renamed from: e, reason: collision with root package name */
    public final javax.crypto.spec.SecretKeySpec f404966e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f404967f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f404968g;

    /* renamed from: h, reason: collision with root package name */
    public t9.t f404969h;

    public o(java.io.File file, byte[] bArr, boolean z17) {
        javax.crypto.Cipher cipher;
        this.f404967f = z17;
        if (bArr != null) {
            t9.a.a(bArr.length == 16);
            try {
                if (t9.d0.f416498a == 18) {
                    try {
                        cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
                    } catch (java.lang.Throwable unused) {
                    }
                    this.f404965d = cipher;
                    this.f404966e = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
                }
                cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5PADDING");
                this.f404965d = cipher;
                this.f404966e = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
            } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e17) {
                throw new java.lang.IllegalStateException(e17);
            }
        } else {
            this.f404965d = null;
            this.f404966e = null;
        }
        this.f404962a = new java.util.HashMap();
        this.f404963b = new android.util.SparseArray();
        this.f404964c = new t9.c(new java.io.File(file, "cached_content_index.exi"));
    }

    public final s9.n a(java.lang.String str, long j17) {
        android.util.SparseArray sparseArray = this.f404963b;
        int size = sparseArray.size();
        int i17 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i17 < size && i17 == sparseArray.keyAt(i17)) {
                i17++;
            }
            keyAt = i17;
        }
        s9.n nVar = new s9.n(keyAt, str, j17);
        this.f404962a.put(str, nVar);
        sparseArray.put(keyAt, str);
        this.f404968g = true;
        return nVar;
    }

    public s9.n b(java.lang.String str) {
        return (s9.n) this.f404962a.get(str);
    }

    public void c() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.HashMap hashMap = this.f404962a;
        for (s9.n nVar : hashMap.values()) {
            if (nVar.f404960c.isEmpty()) {
                linkedList.add(nVar.f404959b);
            }
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            s9.n nVar2 = (s9.n) hashMap.remove((java.lang.String) it.next());
            if (nVar2 != null) {
                t9.a.d(nVar2.f404960c.isEmpty());
                this.f404963b.remove(nVar2.f404958a);
                this.f404968g = true;
            }
        }
    }

    public void d() {
        java.io.DataOutputStream dataOutputStream;
        if (this.f404968g) {
            t9.c cVar = this.f404964c;
            java.io.DataOutputStream dataOutputStream2 = null;
            try {
                try {
                    java.io.OutputStream b17 = cVar.b();
                    t9.t tVar = this.f404969h;
                    if (tVar == null) {
                        this.f404969h = new t9.t(b17);
                    } else {
                        tVar.a(b17);
                    }
                    dataOutputStream = new java.io.DataOutputStream(this.f404969h);
                } catch (java.io.IOException e17) {
                    e = e17;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                dataOutputStream = dataOutputStream2;
            }
            try {
                dataOutputStream.writeInt(1);
                boolean z17 = this.f404967f;
                javax.crypto.Cipher cipher = this.f404965d;
                int i17 = (!z17 || cipher == null) ? 0 : 1;
                dataOutputStream.writeInt(i17);
                if (i17 != 0) {
                    byte[] bArr = new byte[16];
                    new java.util.Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        cipher.init(1, this.f404966e, new javax.crypto.spec.IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream2 = new java.io.DataOutputStream(new javax.crypto.CipherOutputStream(this.f404969h, cipher));
                    } catch (java.security.InvalidAlgorithmParameterException e18) {
                        e = e18;
                        throw new java.lang.IllegalStateException(e);
                    } catch (java.security.InvalidKeyException e19) {
                        e = e19;
                        throw new java.lang.IllegalStateException(e);
                    }
                } else {
                    dataOutputStream2 = dataOutputStream;
                }
                java.util.HashMap hashMap = this.f404962a;
                dataOutputStream2.writeInt(hashMap.size());
                int i18 = 0;
                for (s9.n nVar : hashMap.values()) {
                    int i19 = nVar.f404958a;
                    java.lang.String str = nVar.f404959b;
                    dataOutputStream2.writeInt(i19);
                    dataOutputStream2.writeUTF(str);
                    dataOutputStream2.writeLong(nVar.f404961d);
                    int hashCode = ((nVar.f404958a * 31) + str.hashCode()) * 31;
                    long j17 = nVar.f404961d;
                    i18 += hashCode + ((int) (j17 ^ (j17 >>> 32)));
                }
                dataOutputStream2.writeInt(i18);
                dataOutputStream2.close();
                cVar.f416495b.delete();
                int i27 = t9.d0.f416498a;
                this.f404968g = false;
            } catch (java.io.IOException e27) {
                e = e27;
                dataOutputStream2 = dataOutputStream;
                throw new s9.a(e);
            } catch (java.lang.Throwable th7) {
                th = th7;
                t9.d0.d(dataOutputStream);
                throw th;
            }
        }
    }
}
