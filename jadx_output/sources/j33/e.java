package j33;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final j33.e f297434a = new j33.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f297435b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f297436c;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f297435b = hashMap;
        f297436c = new java.util.HashMap();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(".h264");
        jSONArray.put(".h26l");
        jSONArray.put(".264");
        jSONArray.put(".avc");
        jSONArray.put(".mov");
        jSONArray.put(".mp4");
        jSONArray.put(".m4a");
        jSONArray.put(".3gp");
        jSONArray.put(".3g2");
        jSONArray.put(".mj2");
        jSONArray.put(".m4v");
        jSONObject.put("suffix", jSONArray);
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        jSONArray2.put("video/avc");
        jSONArray2.put("video/hevc");
        jSONArray2.put("video/dolby-vision");
        jSONObject.put("video-mime", jSONArray2);
        cl0.e eVar = new cl0.e();
        eVar.q("audio/mp4a-latm");
        eVar.q(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MPEG);
        jSONObject.put("audio-mime", eVar);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_album_check_file_format, true)) {
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            jSONArray3.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4);
            jSONArray3.put("mov,mp4,m4a,3gp,3g2,mj2");
            jSONObject.put("file-format", jSONArray3);
        }
        hashMap.put(-1, jSONObject);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("include_local_setting", true);
        jSONObject2.put("min-duration-ms", 1000);
        jSONObject2.put("max-duration-ms", 300000);
        hashMap.put(31, jSONObject2);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("include_local_setting", true);
        jSONObject3.put("max-duration-ms", ip.a.f293544a.b());
        hashMap.put(4, jSONObject3);
    }

    public final int a(int i17) {
        java.util.HashMap hashMap = f297435b;
        org.json.JSONObject jSONObject = (org.json.JSONObject) hashMap.get(java.lang.Integer.valueOf(i17));
        org.json.JSONObject jSONObject2 = (org.json.JSONObject) hashMap.get(-1);
        if (jSONObject != null && jSONObject.has("max-duration-ms")) {
            return jSONObject.optInt("max-duration-ms", -1);
        }
        if (jSONObject2 == null || !jSONObject2.has("max-duration-ms")) {
            return -1;
        }
        return jSONObject2.optInt("max-duration-ms", -1);
    }

    public final void b(java.util.ArrayList arrayList, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        arrayList.add(jSONObject);
        if (!jSONObject.optBoolean("include_local_setting", false) || (jSONObject2 = (org.json.JSONObject) f297435b.get(-1)) == null) {
            return;
        }
        arrayList.add(jSONObject2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x03ed, code lost:
    
        if (ph3.f.g() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0405, code lost:
    
        if (fp.h.a(24) != false) goto L178;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x059f A[LOOP:1: B:39:0x00e1->B:46:0x059f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x059d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02dd  */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(int r30, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r31) {
        /*
            Method dump skipped, instructions count: 1449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j33.e.c(int, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem):int");
    }
}
