package hf;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f280985a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f280986b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f280987c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f280988d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f280989e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f280990f;

    /* renamed from: g, reason: collision with root package name */
    public final int f280991g;

    public b(java.lang.String deviceParameters, java.lang.String customParameters, java.lang.String applicationParameters, java.lang.String dateTime, java.lang.String context, java.lang.String crashContent, int i17) {
        kotlin.jvm.internal.o.g(deviceParameters, "deviceParameters");
        kotlin.jvm.internal.o.g(customParameters, "customParameters");
        kotlin.jvm.internal.o.g(applicationParameters, "applicationParameters");
        kotlin.jvm.internal.o.g(dateTime, "dateTime");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(crashContent, "crashContent");
        this.f280985a = deviceParameters;
        this.f280986b = customParameters;
        this.f280987c = applicationParameters;
        this.f280988d = dateTime;
        this.f280989e = context;
        this.f280990f = crashContent;
        this.f280991g = i17;
    }

    public java.lang.String toString() {
        return "Report(deviceParameters='" + this.f280985a + "', customParameters='" + this.f280986b + "', applicationParameters='" + this.f280987c + "', dateTime='" + this.f280988d + "', context='" + this.f280989e + "', crashContent='" + this.f280990f + "', killSelf=" + this.f280991g + ')';
    }
}
