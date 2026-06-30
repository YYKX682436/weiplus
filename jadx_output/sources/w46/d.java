package w46;

/* loaded from: classes12.dex */
public class d extends java.lang.RuntimeException implements w46.b {

    /* renamed from: d, reason: collision with root package name */
    public final w46.c f442932d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Throwable f442933e;

    public d(java.lang.Throwable th6) {
        this.f442932d = new w46.c(this);
        this.f442933e = null;
        this.f442933e = th6;
    }

    public final void a(java.io.PrintWriter printWriter) {
        super.printStackTrace(printWriter);
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.f442933e;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        }
        java.lang.Throwable th6 = this.f442933e;
        if (th6 != null) {
            return th6.toString();
        }
        return null;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintStream printStream) {
        w46.c cVar = this.f442932d;
        cVar.getClass();
        synchronized (printStream) {
            java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.OutputStream) printStream, false);
            cVar.a(printWriter);
            printWriter.flush();
        }
    }

    public d(java.lang.String str, java.lang.Throwable th6) {
        super(str);
        this.f442932d = new w46.c(this);
        this.f442933e = null;
        this.f442933e = th6;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintWriter printWriter) {
        this.f442932d.a(printWriter);
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        java.io.PrintStream printStream = java.lang.System.err;
        w46.c cVar = this.f442932d;
        cVar.getClass();
        synchronized (printStream) {
            java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.OutputStream) printStream, false);
            cVar.a(printWriter);
            printWriter.flush();
        }
    }
}
