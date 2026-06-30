package k91;

/* loaded from: classes5.dex */
public abstract class n3 {

    /* renamed from: a, reason: collision with root package name */
    public static final org.json.JSONObject f305692a = new org.json.JSONObject();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f305693b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f305694c = new java.util.LinkedHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if ((r6.length() == 0 ? false : com.tencent.mm.sdk.platformtools.o4.M(r6).getBoolean("ready", false)) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        r7 = vz5.v.c(new com.tencent.mm.vfs.z6(r4.u() + "/info.json"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fe, code lost:
    
        if (r7.length() != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0100, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0103, code lost:
    
        if (r11 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0105, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WAGameTagConfigHelper", "resource info json file empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010c, code lost:
    
        r7 = new org.json.JSONObject(r7).optJSONArray("icon_info_list");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0117, code lost:
    
        if (r7 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:
    
        if (r8 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011f, code lost:
    
        r8 = r7.length();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0124, code lost:
    
        if (r11 >= r8) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0126, code lost:
    
        r12 = r7.getJSONObject(r11);
        r13 = r12.optInt("icon_type");
        r14 = r12.optInt("icon_width");
        r15 = r12.optInt("icon_height");
        r9 = r12.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        r6 = r12.optString("url");
        r16 = r7;
        r7 = r12.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        r17 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014e, code lost:
    
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0150, code lost:
    
        r10 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0155, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0157, code lost:
    
        r10.append(r4.u());
        r10.append('/');
        r10.append(r9);
        r8 = new com.tencent.mm.vfs.r6(r10.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WAGameTagConfigHelper", "iconType:" + r13 + " w:" + r14 + " h:" + r15 + " path:" + r9 + " url:" + r6 + " text:" + r7 + " iconFileExist:" + r8.m());
        r5 = new org.json.JSONObject();
        r5.put("icon_width", r14);
        r5.put("icon_height", r15);
        r5.put("iamgeURL", r6);
        r5.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, r7);
        r6 = new com.tencent.mm.vfs.r6(r8);
        k91.n3.f305693b.put(java.lang.Integer.valueOf(r13), r12);
        k91.n3.f305694c.put(java.lang.Integer.valueOf(r13), r6);
        k91.n3.f305692a.put(java.lang.String.valueOf(r13), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e8, code lost:
    
        r11 = r11 + 1;
        r7 = r16;
        r8 = r17;
        r10 = r18;
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0214, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WAGameTagConfigHelper", "resource info json file not found, " + r0);
        r0 = r19.c();
        r1 = r19.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x022d, code lost:
    
        if (r0 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x022f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0235, code lost:
    
        if (r0 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0237, code lost:
    
        r0 = new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l(r1, false, false), null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0278, code lost:
    
        com.tencent.mm.vfs.w6.f(r0.toString());
        r18.a(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0247, code lost:
    
        r2 = r1.isEmpty();
        r3 = r0.f213279f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x024d, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x024f, code lost:
    
        r3 = com.tencent.mm.vfs.e8.l(r3 + '/' + r1, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0268, code lost:
    
        r0 = new com.tencent.mm.vfs.z7(r0.f213277d, r0.f213278e, r3, r0.f213280g, r0.f213281h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0231, code lost:
    
        r0 = com.tencent.mm.vfs.z7.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f8, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011a, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0102, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x020f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0210, code lost:
    
        r19 = r5;
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01fc, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WAGameTagConfigHelper", "resource info json invalid, " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d8, code lost:
    
        if ((r6.length() == 0 ? false : com.tencent.mm.sdk.platformtools.o4.M(r6).getBoolean("ready", false)) == false) goto L85;
     */
    static {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.n3.<clinit>():void");
    }
}
