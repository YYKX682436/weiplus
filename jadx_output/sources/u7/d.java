package u7;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f425038d = java.util.regex.Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.regex.Pattern f425039e = java.util.regex.Pattern.compile("GET /(.*) HTTP");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f425040a;

    /* renamed from: b, reason: collision with root package name */
    public final long f425041b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f425042c;

    public d(java.lang.String str) {
        str.getClass();
        java.util.regex.Matcher matcher = f425038d.matcher(str);
        long parseLong = matcher.find() ? java.lang.Long.parseLong(matcher.group(1)) : -1L;
        this.f425041b = java.lang.Math.max(0L, parseLong);
        this.f425042c = parseLong >= 0;
        java.util.regex.Matcher matcher2 = f425039e.matcher(str);
        if (matcher2.find()) {
            this.f425040a = matcher2.group(1);
            return;
        }
        throw new java.lang.IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public static u7.d a(java.io.InputStream inputStream) {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, com.tencent.mapsdk.internal.rv.f51270c));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (android.text.TextUtils.isEmpty(readLine)) {
                return new u7.d(sb6.toString());
            }
            sb6.append(readLine);
            sb6.append('\n');
        }
    }

    public java.lang.String toString() {
        return "GetRequest{rangeOffset=" + this.f425041b + ", partial=" + this.f425042c + ", uri='" + this.f425040a + "'}";
    }
}
