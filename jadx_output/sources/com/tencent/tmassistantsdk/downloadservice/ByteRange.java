package com.tencent.tmassistantsdk.downloadservice;

/* loaded from: classes13.dex */
public class ByteRange {
    protected static final java.lang.String BYTES_UNIT = "bytes";
    protected static final java.lang.String INVALID_RANGE_HEADER_REGEX = "((?:\\s*,\\s*(?:\\d*)-(?:\\d*))*)";
    protected static final java.lang.String UNIT_REGEX = "([^=\\s]+)";
    protected static final java.lang.String VALID_CONTENT_RANGE_HEADER_REGEX = "bytes\\s+(\\d+)-(\\d+)/(\\d+)";
    protected static final java.lang.String VALID_RANGE_HEADER_REGEX = "([^=\\s]+)\\s*=\\s*(\\d*)\\s*-\\s*(\\d*)";
    protected final java.lang.Long end;
    protected final long start;
    protected static final java.util.regex.Pattern RANGE_HEADER_PATTERN = java.util.regex.Pattern.compile("^\\s*([^=\\s]+)\\s*=\\s*(\\d*)\\s*-\\s*(\\d*)((?:\\s*,\\s*(?:\\d*)-(?:\\d*))*)\\s*$");
    protected static final java.util.regex.Pattern CONTENT_RANGE_HEADER_PATTERN = java.util.regex.Pattern.compile("^\\s*bytes\\s+(\\d+)-(\\d+)/(\\d+)\\s*$");

    public ByteRange(long j17) {
        this(j17, (java.lang.Long) null);
    }

    public static long getTotalSize(java.lang.String str) {
        int indexOf = str.indexOf("/");
        if (indexOf != -1) {
            return com.tencent.mm.sdk.platformtools.t8.E1(str.substring(indexOf + 1));
        }
        throw new android.content.res.Resources.NotFoundException();
    }

    public static com.tencent.tmassistantsdk.downloadservice.ByteRange parseContentRange(java.lang.String str) {
        java.util.regex.Matcher matcher = CONTENT_RANGE_HEADER_PATTERN.matcher(str);
        if (matcher.matches()) {
            return new com.tencent.tmassistantsdk.downloadservice.ByteRange(com.tencent.mm.sdk.platformtools.t8.E1(matcher.group(1)), com.tencent.mm.sdk.platformtools.t8.E1(matcher.group(2)));
        }
        throw new java.lang.Throwable("Invalid content-range format: " + str);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.tmassistantsdk.downloadservice.ByteRange)) {
            return false;
        }
        com.tencent.tmassistantsdk.downloadservice.ByteRange byteRange = (com.tencent.tmassistantsdk.downloadservice.ByteRange) obj;
        if (this.start != byteRange.getStart() || hasEnd() != byteRange.hasEnd()) {
            return false;
        }
        if (hasEnd()) {
            return this.end.equals(java.lang.Long.valueOf(byteRange.getEnd()));
        }
        return true;
    }

    public long getEnd() {
        if (hasEnd()) {
            return this.end.longValue();
        }
        throw new java.lang.IllegalStateException("Byte-range does not have end.  Check hasEnd() before use");
    }

    public long getStart() {
        return this.start;
    }

    public boolean hasEnd() {
        return this.end != null;
    }

    public int hashCode() {
        int hashCode = 629 + java.lang.Long.valueOf(this.start).hashCode();
        java.lang.Long l17 = this.end;
        return l17 != null ? (hashCode * 37) + l17.hashCode() : hashCode;
    }

    public java.lang.String toString() {
        if (this.end != null) {
            return "bytes=" + this.start + "-" + this.end;
        }
        if (this.start < 0) {
            return "bytes=" + this.start;
        }
        return "bytes=" + this.start + "-";
    }

    public ByteRange(long j17, long j18) {
        this(j17, java.lang.Long.valueOf(j18));
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("If end is provided, start must be positive.");
        }
        if (j18 < j17) {
            throw new java.lang.IllegalArgumentException("end must be >= start.");
        }
    }

    public ByteRange(long j17, java.lang.Long l17) {
        this.start = j17;
        this.end = l17;
    }
}
