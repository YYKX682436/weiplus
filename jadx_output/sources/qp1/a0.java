package qp1;

/* loaded from: classes8.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f365682a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f365682a = hashMap;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.raw.file_float_ball_icon_word);
        hashMap.put("doc", valueOf);
        hashMap.put("docx", valueOf);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.R.raw.file_float_ball_icon_ppt);
        hashMap.put("ppt", valueOf2);
        hashMap.put("pptx", valueOf2);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.tencent.mm.R.raw.file_float_ball_icon_excel);
        hashMap.put("xls", valueOf3);
        hashMap.put("xlsx", valueOf3);
        hashMap.put("pdf", java.lang.Integer.valueOf(com.tencent.mm.R.raw.file_float_ball_icon_pdf));
        hashMap.put("numbers", java.lang.Integer.valueOf(com.tencent.mm.R.raw.file_float_ball_icon_numbers));
        hashMap.put("pages", java.lang.Integer.valueOf(com.tencent.mm.R.raw.file_float_ball_icon_pages));
        hashMap.put("key", java.lang.Integer.valueOf(com.tencent.mm.R.raw.file_float_ball_icon_key));
        hashMap.put("txt", java.lang.Integer.valueOf(com.tencent.mm.R.raw.file_float_ball_icon_txt));
        hashMap.put(com.eclipsesource.mmv8.Platform.UNKNOWN, java.lang.Integer.valueOf(com.tencent.mm.R.raw.file_float_ball_icon_default));
        hashMap.put("ofd", java.lang.Integer.valueOf(com.tencent.mm.R.raw.file_float_ball_icon_ofd));
    }

    public static boolean a(android.view.View view, int i17, int i18) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i19 = iArr[0];
        int i27 = iArr[1];
        return new android.graphics.Rect(i19, i27, view.getWidth() + i19, view.getHeight() + i27).contains(i17, i18);
    }

    public static java.lang.Integer b(java.lang.String str) {
        return (java.lang.Integer) ((java.util.HashMap) f365682a).get(str);
    }
}
