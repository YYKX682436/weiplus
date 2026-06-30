package t6;

/* loaded from: classes13.dex */
public abstract class g {
    public static int a(java.util.List list, java.io.InputStream inputStream, x6.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new d7.i0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            try {
                int c17 = ((t6.f) list.get(i17)).c(inputStream, bVar);
                if (c17 != -1) {
                    return c17;
                }
                inputStream.reset();
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static com.bumptech.glide.load.ImageHeaderParser$ImageType b(java.util.List list, java.io.InputStream inputStream, x6.b bVar) {
        if (inputStream == null) {
            return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new d7.i0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            try {
                com.bumptech.glide.load.ImageHeaderParser$ImageType a17 = ((t6.f) list.get(i17)).a(inputStream);
                if (a17 != com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN) {
                    return a17;
                }
                inputStream.reset();
            } finally {
                inputStream.reset();
            }
        }
        return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
    }
}
